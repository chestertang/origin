/*     */ package javax.ws.rs.ext;
/*     */ 
/*     */ import java.lang.reflect.ReflectPermission;
/*     */ import java.net.URL;
/*     */ import javax.ws.rs.core.Application;
/*     */ import javax.ws.rs.core.Response.ResponseBuilder;
/*     */ import javax.ws.rs.core.UriBuilder;
/*     */ import javax.ws.rs.core.Variant.VariantListBuilder;
/*     */ 
/*     */ public abstract class RuntimeDelegate
/*     */ {
/*     */   public static final String JAXRS_RUNTIME_DELEGATE_PROPERTY = "javax.ws.rs.ext.RuntimeDelegate";
/*     */   private static final String JAXRS_DEFAULT_RUNTIME_DELEGATE = "com.sun.ws.rs.ext.RuntimeDelegateImpl";
/*  44 */   private static ReflectPermission rp = new ReflectPermission("suppressAccessChecks");
/*     */   private static volatile RuntimeDelegate rd;
/*     */ 
/*     */   public static RuntimeDelegate getInstance()
/*     */   {
/*  86 */     RuntimeDelegate result = rd;
/*  87 */     if (result == null) {
/*  88 */       synchronized (RuntimeDelegate.class) {
/*  89 */         result = rd;
/*  90 */         if (result == null) {
/*  91 */           rd = result = findDelegate();
/*     */         }
/*     */       }
/*     */     }
/*  95 */     return result;
/*     */   }
/*     */ 
/*     */   private static RuntimeDelegate findDelegate()
/*     */   {
/*     */     try
/*     */     {
/* 105 */       Object delegate = FactoryFinder.find("javax.ws.rs.ext.RuntimeDelegate", "com.sun.ws.rs.ext.RuntimeDelegateImpl");
/*     */ 
/* 108 */       if (!(delegate instanceof RuntimeDelegate)) {
/* 109 */         Class pClass = RuntimeDelegate.class;
/* 110 */         String classnameAsResource = pClass.getName().replace('.', '/') + ".class";
/* 111 */         ClassLoader loader = pClass.getClassLoader();
/* 112 */         if (loader == null) {
/* 113 */           loader = ClassLoader.getSystemClassLoader();
/*     */         }
/* 115 */         URL targetTypeURL = loader.getResource(classnameAsResource);
/* 116 */         throw new LinkageError("ClassCastException: attempting to cast" + delegate.getClass().getClassLoader().getResource(classnameAsResource) + "to" + targetTypeURL.toString());
/*     */       }
/*     */ 
/* 120 */       return (RuntimeDelegate)delegate; } catch (Exception ex) {
/*     */     }
/* 122 */     throw new RuntimeException(ex);
/*     */   }
/*     */ 
/*     */   public static void setInstance(RuntimeDelegate rd)
/*     */     throws SecurityException
/*     */   {
/* 135 */     SecurityManager security = System.getSecurityManager();
/* 136 */     if (security != null) {
/* 137 */       security.checkPermission(rp);
/*     */     }
/* 139 */     synchronized (RuntimeDelegate.class) {
/* 140 */       rd = rd;
/*     */     }
/*     */   }
/*     */ 
/*     */   public abstract UriBuilder createUriBuilder();
/*     */ 
/*     */   public abstract Response.ResponseBuilder createResponseBuilder();
/*     */ 
/*     */   public abstract Variant.VariantListBuilder createVariantListBuilder();
/*     */ 
/*     */   public abstract <T> T createEndpoint(Application paramApplication, Class<T> paramClass)
/*     */     throws IllegalArgumentException, UnsupportedOperationException;
/*     */ 
/*     */   public abstract <T> HeaderDelegate<T> createHeaderDelegate(Class<T> paramClass);
/*     */ 
/*     */   public static abstract interface HeaderDelegate<T>
/*     */   {
/*     */     public abstract T fromString(String paramString)
/*     */       throws IllegalArgumentException;
/*     */ 
/*     */     public abstract String toString(T paramT);
/*     */   }
/*     */ }

/* Location:           C:\Users\Administrator\Desktop\jsr311-api-1.1.1.jar
 * Qualified Name:     javax.ws.rs.ext.RuntimeDelegate
 * JD-Core Version:    0.6.0
 */