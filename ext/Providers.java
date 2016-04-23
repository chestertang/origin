package javax.ws.rs.ext;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.ws.rs.core.MediaType;

public abstract interface Providers
{
  public abstract <T> MessageBodyReader<T> getMessageBodyReader(Class<T> paramClass, Type paramType, Annotation[] paramArrayOfAnnotation, MediaType paramMediaType);

  public abstract <T> MessageBodyWriter<T> getMessageBodyWriter(Class<T> paramClass, Type paramType, Annotation[] paramArrayOfAnnotation, MediaType paramMediaType);

  public abstract <T extends Throwable> ExceptionMapper<T> getExceptionMapper(Class<T> paramClass);

  public abstract <T> ContextResolver<T> getContextResolver(Class<T> paramClass, MediaType paramMediaType);
}

/* Location:           C:\Users\Administrator\Desktop\jsr311-api-1.1.1.jar
 * Qualified Name:     javax.ws.rs.ext.Providers
 * JD-Core Version:    0.6.0
 */