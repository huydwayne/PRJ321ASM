/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.listener;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;

/**
 * Web application lifecycle listener.
 *
 * @author HiGien
 */
public class ServletContextListener implements javax.servlet.ServletContextListener {
private static Map<String, String> sitemap;
    
private static Map<String, String> readSiteMap(String path) throws IOException {
        File file = null;
        FileReader fr = null;
        BufferedReader bf = null;
        Map<String, String> map = new HashMap<>();
        try {
            file = new File(path);
            fr = new FileReader(file);
            bf = new BufferedReader(fr);
            while (bf.ready()) {
                String[] line = bf.readLine().split("=");
                map.put(line[0], line[1]);
            }
        } finally {
            if (bf != null) {
                bf.close();
            }
            if (fr != null) {
                fr.close();
            }
        }
        return map;
    }
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext context = sce.getServletContext();
        String path = context.getRealPath("/WEB-INF/sitemap.txt");
        if (sitemap == null){
            try {
                sitemap = readSiteMap(path);
                context.setAttribute("map", sitemap);
            } catch (IOException ex) {
                Logger.getLogger(ServletContextListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
