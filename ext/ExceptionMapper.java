package javax.ws.rs.ext;

import javax.ws.rs.core.Response;

public abstract interface ExceptionMapper<E extends Throwable>
{
  public abstract Response toResponse(E paramE);
}

/* Location:           C:\Users\Administrator\Desktop\jsr311-api-1.1.1.jar
 * Qualified Name:     javax.ws.rs.ext.ExceptionMapper
 * JD-Core Version:    0.6.0
 */