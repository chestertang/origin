package javax.ws.rs.ext;

import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

public abstract interface MessageBodyReader<T>
{
  public abstract boolean isReadable(Class<?> paramClass, Type paramType, Annotation[] paramArrayOfAnnotation, MediaType paramMediaType);

  public abstract T readFrom(Class<T> paramClass, Type paramType, Annotation[] paramArrayOfAnnotation, MediaType paramMediaType, MultivaluedMap<String, String> paramMultivaluedMap, InputStream paramInputStream)
    throws IOException, WebApplicationException;
}

/* Location:           C:\Users\Administrator\Desktop\jsr311-api-1.1.1.jar
 * Qualified Name:     javax.ws.rs.ext.MessageBodyReader
 * JD-Core Version:    0.6.0
 */