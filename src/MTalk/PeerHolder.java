package MTalk;

/**
* MTalk/PeerHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from talk.idl
* mardi 4 janvier 2011 17 h 51 CET
*/

public final class PeerHolder implements org.omg.CORBA.portable.Streamable
{
  public MTalk.Peer value = null;

  public PeerHolder ()
  {
  }

  public PeerHolder (MTalk.Peer initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = MTalk.PeerHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    MTalk.PeerHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return MTalk.PeerHelper.type ();
  }

}
