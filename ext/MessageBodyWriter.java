package javax.ws.rs.ext;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

public abstract interface MessageBodyWriter<T>
{
  public abstract boolean isWriteable(Class<?> paramClass, Type paramType, Annotation[] paramArrayOfAnnotation, MediaType paramMediaType);

  public abstract long getSize(T paramT, Class<?> paramClass, Type paramType, Annotation[] paramArrayOfAnnotation, MediaType paramMediaType);

  public abstract void writeTo(T paramT, Class<?> paramClass, Type paramType, Annotation[] paramArrayOfAnnotation, MediaType paramMediaType, MultivaluedMap<String, Object> paramMultivaluedMap, OutputStream paramOutputStream)
    throws IOException, WebApplicationException;
}

/* Location:           C:\Users\Administrator\Desktop\jsr311-api-1.1.1.jar
 * Qualified Name:     javax.ws.rs.ext.MessageBodyWriter
 * JD-Core Version:    0.6.0
 */