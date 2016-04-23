package javax.ws.rs.ext;

public abstract interface ContextResolver<T>
{
  public abstract T getContext(Class<?> paramClass);
}

/* Location:           C:\Users\Administrator\Desktop\jsr311-api-1.1.1.jar
 * Qualified Name:     javax.ws.rs.ext.ContextResolver
 * JD-Core Version:    0.6.0
 */