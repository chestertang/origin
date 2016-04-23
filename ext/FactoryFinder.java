/*     */ package javax.ws.rs.ext;
/*     */ 
/*     */ import java.io.BufferedReader;
/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.InputStream;
/*     */ import java.io.InputStreamReader;
/*     */ import java.security.AccessController;
/*     */ import java.security.PrivilegedAction;
/*     */ import java.util.Properties;
/*     */ 
/*     */ class FactoryFinder
/*     */ {
/*     */   static ClassLoader getContextClassLoader()
/*     */   {
/*  33 */     return (ClassLoader)AccessController.doPrivileged(new PrivilegedAction()
/*     */     {
/*     */       public ClassLoader run() {
/*  36 */         ClassLoader cl = null;
/*     */         try {
/*  38 */           cl = Thread.currentThread().getContextClassLoader(); } catch (SecurityException ex) {
/*     */         }
/*  40 */         return cl;
/*     */       }
/*     */     });
/*     */   }
/*     */ 
/*     */   private static Object newInstance(String className, ClassLoader classLoader)
/*     */     throws ClassNotFoundException
/*     */   {
/*     */     try
/*     */     {
/*     */       Class spiClass;
/*     */       Class spiClass;
/*  56 */       if (classLoader == null)
/*  57 */         spiClass = Class.forName(className);
/*     */       else {
/*     */         try {
/*  60 */           spiClass = Class.forName(className, false, classLoader);
/*     */         } catch (ClassNotFoundException ex) {
/*  62 */           spiClass = Class.forName(className);
/*     */         }
/*     */       }
/*  65 */       return spiClass.newInstance();
/*     */     } catch (ClassNotFoundException x) {
/*  67 */       throw x; } catch (Exception x) {
/*     */     }
/*  69 */     throw new ClassNotFoundException("Provider " + className + " could not be instantiated: " + x, x);
/*     */   }
/*     */ 
/*     */   static Object find(String factoryId, String fallbackClassName)
/*     */     throws ClassNotFoundException
/*     */   {
/*  96 */     ClassLoader classLoader = getContextClassLoader();
/*     */ 
/*  98 */     String serviceId = "META-INF/services/" + factoryId;
/*     */     try
/*     */     {
/*     */       InputStream is;
/*     */       InputStream is;
/* 102 */       if (classLoader == null)
/* 103 */         is = ClassLoader.getSystemResourceAsStream(serviceId);
/*     */       else {
/* 105 */         is = classLoader.getResourceAsStream(serviceId);
/*     */       }
/*     */ 
/* 108 */       if (is != null) {
/* 109 */         BufferedReader rd = new BufferedReader(new InputStreamReader(is, "UTF-8"));
/*     */ 
/* 112 */         String factoryClassName = rd.readLine();
/* 113 */         rd.close();
/*     */ 
/* 115 */         if ((factoryClassName != null) && (!"".equals(factoryClassName)))
/*     */         {
/* 117 */           return newInstance(factoryClassName, classLoader);
/*     */         }
/*     */       }
/*     */     }
/*     */     catch (Exception ex)
/*     */     {
/*     */     }
/*     */     try
/*     */     {
/* 126 */       String javah = System.getProperty("java.home");
/* 127 */       String configFile = javah + File.separator + "lib" + File.separator + "jaxrs.properties";
/*     */ 
/* 129 */       File f = new File(configFile);
/* 130 */       if (f.exists()) {
/* 131 */         Properties props = new Properties();
/* 132 */         props.load(new FileInputStream(f));
/* 133 */         String factoryClassName = props.getProperty(factoryId);
/* 134 */         return newInstance(factoryClassName, classLoader);
/*     */       }
/*     */     }
/*     */     catch (Exception ex)
/*     */     {
/*     */     }
/*     */     try
/*     */     {
/* 142 */       String systemProp = System.getProperty(factoryId);
/*     */ 
/* 144 */       if (systemProp != null)
/* 145 */         return newInstance(systemProp, classLoader);
/*     */     }
/*     */     catch (SecurityException se)
/*     */     {
/*     */     }
/* 150 */     if (fallbackClassName == null) {
/* 151 */       throw new ClassNotFoundException("Provider for " + factoryId + " cannot be found", null);
/*     */     }
/*     */ 
/* 155 */     return newInstance(fallbackClassName, classLoader);
/*     */   }
/*     */ }

/* Location:           C:\Users\Administrator\Desktop\jsr311-api-1.1.1.jar
 * Qualified Name:     javax.ws.rs.ext.FactoryFinder
 * JD-Core Version:    0.6.0
 */