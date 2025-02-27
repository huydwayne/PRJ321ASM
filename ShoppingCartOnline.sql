USE [master]
GO
/****** Object:  Database [ShoppingCartOnline]    Script Date: 11/10/2020 22:22:08 ******/
CREATE DATABASE [ShoppingCartOnline] ON  PRIMARY 
( NAME = N'ShoppingCartOnline', FILENAME = N'c:\Program Files\Microsoft SQL Server\MSSQL10_50.MSSQLSERVER\MSSQL\DATA\ShoppingCartOnline.mdf' , SIZE = 2048KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'ShoppingCartOnline_log', FILENAME = N'c:\Program Files\Microsoft SQL Server\MSSQL10_50.MSSQLSERVER\MSSQL\DATA\ShoppingCartOnline_log.ldf' , SIZE = 1024KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [ShoppingCartOnline] SET COMPATIBILITY_LEVEL = 100
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [ShoppingCartOnline].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [ShoppingCartOnline] SET ANSI_NULL_DEFAULT OFF
GO
ALTER DATABASE [ShoppingCartOnline] SET ANSI_NULLS OFF
GO
ALTER DATABASE [ShoppingCartOnline] SET ANSI_PADDING OFF
GO
ALTER DATABASE [ShoppingCartOnline] SET ANSI_WARNINGS OFF
GO
ALTER DATABASE [ShoppingCartOnline] SET ARITHABORT OFF
GO
ALTER DATABASE [ShoppingCartOnline] SET AUTO_CLOSE OFF
GO
ALTER DATABASE [ShoppingCartOnline] SET AUTO_CREATE_STATISTICS ON
GO
ALTER DATABASE [ShoppingCartOnline] SET AUTO_SHRINK OFF
GO
ALTER DATABASE [ShoppingCartOnline] SET AUTO_UPDATE_STATISTICS ON
GO
ALTER DATABASE [ShoppingCartOnline] SET CURSOR_CLOSE_ON_COMMIT OFF
GO
ALTER DATABASE [ShoppingCartOnline] SET CURSOR_DEFAULT  GLOBAL
GO
ALTER DATABASE [ShoppingCartOnline] SET CONCAT_NULL_YIELDS_NULL OFF
GO
ALTER DATABASE [ShoppingCartOnline] SET NUMERIC_ROUNDABORT OFF
GO
ALTER DATABASE [ShoppingCartOnline] SET QUOTED_IDENTIFIER OFF
GO
ALTER DATABASE [ShoppingCartOnline] SET RECURSIVE_TRIGGERS OFF
GO
ALTER DATABASE [ShoppingCartOnline] SET  DISABLE_BROKER
GO
ALTER DATABASE [ShoppingCartOnline] SET AUTO_UPDATE_STATISTICS_ASYNC OFF
GO
ALTER DATABASE [ShoppingCartOnline] SET DATE_CORRELATION_OPTIMIZATION OFF
GO
ALTER DATABASE [ShoppingCartOnline] SET TRUSTWORTHY OFF
GO
ALTER DATABASE [ShoppingCartOnline] SET ALLOW_SNAPSHOT_ISOLATION OFF
GO
ALTER DATABASE [ShoppingCartOnline] SET PARAMETERIZATION SIMPLE
GO
ALTER DATABASE [ShoppingCartOnline] SET READ_COMMITTED_SNAPSHOT OFF
GO
ALTER DATABASE [ShoppingCartOnline] SET HONOR_BROKER_PRIORITY OFF
GO
ALTER DATABASE [ShoppingCartOnline] SET  READ_WRITE
GO
ALTER DATABASE [ShoppingCartOnline] SET RECOVERY SIMPLE
GO
ALTER DATABASE [ShoppingCartOnline] SET  MULTI_USER
GO
ALTER DATABASE [ShoppingCartOnline] SET PAGE_VERIFY CHECKSUM
GO
ALTER DATABASE [ShoppingCartOnline] SET DB_CHAINING OFF
GO
USE [ShoppingCartOnline]
GO
/****** Object:  Table [dbo].[User]    Script Date: 11/10/2020 22:22:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[User](
	[username] [varchar](20) NOT NULL,
	[password] [varchar](20) NOT NULL,
	[name] [varchar](20) NOT NULL,
	[role] [bit] NOT NULL,
 CONSTRAINT [PK_Users] PRIMARY KEY CLUSTERED 
(
	[username] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[User] ([username], [password], [name], [role]) VALUES (N'admin', N'admin', N'Admin', 1)
INSERT [dbo].[User] ([username], [password], [name], [role]) VALUES (N'huydwayne', N'huy123', N'Huy Bui', 0)
/****** Object:  Table [dbo].[Product]    Script Date: 11/10/2020 22:22:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Product](
	[ProductID] [varchar](20) NOT NULL,
	[ProductName] [varchar](20) NOT NULL,
	[ProductDescription] [varchar](100) NOT NULL,
	[ProductPrice] [decimal](18, 0) NOT NULL,
	[ProductImage] [varchar](50) NOT NULL,
 CONSTRAINT [PK_Product] PRIMARY KEY CLUSTERED 
(
	[ProductID] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[Product] ([ProductID], [ProductName], [ProductDescription], [ProductPrice], [ProductImage]) VALUES (N'p2', N'Some Lungs', N'Fresh Lungs. Ready to Serve.', CAST(10000 AS Decimal(18, 0)), N'1605021623959.jpg')
INSERT [dbo].[Product] ([ProductID], [ProductName], [ProductDescription], [ProductPrice], [ProductImage]) VALUES (N'p3', N'Some Hearts', N'Fresh Heart. Expected 3 days to restock', CAST(119000 AS Decimal(18, 0)), N'1605021629950.jpg')
/****** Object:  Table [dbo].[Order]    Script Date: 11/10/2020 22:22:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Order](
	[OrderID] [int] IDENTITY(1,1) NOT NULL,
	[Username] [varchar](20) NOT NULL,
	[OrderDate] [date] NOT NULL,
	[Total] [decimal](18, 0) NOT NULL,
 CONSTRAINT [PK_Order] PRIMARY KEY CLUSTERED 
(
	[OrderID] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[OrderLine]    Script Date: 11/10/2020 22:22:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[OrderLine](
	[OrderID] [int] NOT NULL,
	[ProductID] [varchar](20) NOT NULL,
	[Quantity] [int] NOT NULL,
 CONSTRAINT [PK_OrderLine] PRIMARY KEY CLUSTERED 
(
	[OrderID] ASC,
	[ProductID] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Default [DF_Order_OrderDate]    Script Date: 11/10/2020 22:22:08 ******/
ALTER TABLE [dbo].[Order] ADD  CONSTRAINT [DF_Order_OrderDate]  DEFAULT (getdate()) FOR [OrderDate]
GO
/****** Object:  ForeignKey [FK_Order_User]    Script Date: 11/10/2020 22:22:08 ******/
ALTER TABLE [dbo].[Order]  WITH CHECK ADD  CONSTRAINT [FK_Order_User] FOREIGN KEY([Username])
REFERENCES [dbo].[User] ([username])
GO
ALTER TABLE [dbo].[Order] CHECK CONSTRAINT [FK_Order_User]
GO
/****** Object:  ForeignKey [FK_OrderLine_Order]    Script Date: 11/10/2020 22:22:08 ******/
ALTER TABLE [dbo].[OrderLine]  WITH CHECK ADD  CONSTRAINT [FK_OrderLine_Order] FOREIGN KEY([OrderID])
REFERENCES [dbo].[Order] ([OrderID])
GO
ALTER TABLE [dbo].[OrderLine] CHECK CONSTRAINT [FK_OrderLine_Order]
GO
/****** Object:  ForeignKey [FK_OrderLine_Product]    Script Date: 11/10/2020 22:22:08 ******/
ALTER TABLE [dbo].[OrderLine]  WITH CHECK ADD  CONSTRAINT [FK_OrderLine_Product] FOREIGN KEY([ProductID])
REFERENCES [dbo].[Product] ([ProductID])
GO
ALTER TABLE [dbo].[OrderLine] CHECK CONSTRAINT [FK_OrderLine_Product]
GO
