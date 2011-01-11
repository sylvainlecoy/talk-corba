package MTalk;


/**
* MTalk/_TalkStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from talk.idl
* mardi 4 janvier 2011 17 h 51 CET
*/

public class _TalkStub extends org.omg.CORBA.portable.ObjectImpl implements MTalk.Talk
{


  /**
  		 * @param numConvSideB : numéro que l'appelant donne à la conversation vue de son c�}té
  		 * @param numConvSideA : numéro que l'appelé a donné à la conversation vue de son c�}té, lors de l'appel à requestTalk
  		 * @param talkIor : Ior de l'objet talk créé par l'appelant pour gérer cette discussion
  		 *
  		 **/
  public void accept (short numConvSideB, short numConvSideA, String talkIor)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("accept", false);
                $out.write_ushort (numConvSideB);
                $out.write_ushort (numConvSideA);
                $out.write_string (talkIor);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                accept (numConvSideB, numConvSideA, talkIor        );
            } finally {
                _releaseReply ($in);
            }
  } // accept


  /**
  		 * @param numConvSideA : numéro que l'appelé a donné à la conversation vue de son c�}té, lors de l'appel à requestTalk
  		 **/
  public void deny (short numConvSideA)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("deny", true);
                $out.write_ushort (numConvSideA);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                deny (numConvSideA        );
            } finally {
                _releaseReply ($in);
            }
  } // deny


  /**
  		 * @param numConvYourSide : numéro identifiant la conversation du c�}té de l'appelé.
  		 * 							C'est à dire : je t'envoie un message sur la conversation
  		 * 							à laquelle tu as donné le numéro numConvYourSide.
  		 * @param message : message envoyé de l'appelant à l'appelé. A priori, à afficher à l'utilisateur.
  		 **/
  public void talk (short numConvYourSide, String message)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("talk", true);
                $out.write_ushort (numConvYourSide);
                $out.write_string (message);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                talk (numConvYourSide, message        );
            } finally {
                _releaseReply ($in);
            }
  } // talk


  /**
  		 * @param numConvYourSide : numéro de la conversation vue du c�}té de l'appelé
  		 **/
  public void stop (short numConvYourSide)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("stop", false);
                $out.write_ushort (numConvYourSide);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                stop (numConvYourSide        );
            } finally {
                _releaseReply ($in);
            }
  } // stop

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:MTalk/Talk:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.Object obj = org.omg.CORBA.ORB.init (args, props).string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     String str = org.omg.CORBA.ORB.init (args, props).object_to_string (this);
     s.writeUTF (str);
  }
} // class _TalkStub