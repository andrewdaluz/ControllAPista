package generatedCorba;


/**
* generatedCorba/_EstacionamentoControllerStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from EstacionamentoController.idl
* Quarta-feira, 29 de Maio de 2013 18h59min23s AMT
*/

public class _EstacionamentoControllerStub extends org.omg.CORBA.portable.ObjectImpl implements generatedCorba.EstacionamentoController
{

  public boolean reservaEstacionamento (String placa, org.omg.CORBA.BooleanHolder ret)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("reservaEstacionamento", true);
                $out.write_string (placa);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                ret.value = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return reservaEstacionamento (placa, ret        );
            } finally {
                _releaseReply ($in);
            }
  } // reservaEstacionamento

  public boolean removeReserva (String placa, org.omg.CORBA.BooleanHolder ret)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("removeReserva", true);
                $out.write_string (placa);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                ret.value = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return removeReserva (placa, ret        );
            } finally {
                _releaseReply ($in);
            }
  } // removeReserva

  public boolean isLotado (org.omg.CORBA.BooleanHolder ret)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("isLotado", true);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                ret.value = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return isLotado (ret        );
            } finally {
                _releaseReply ($in);
            }
  } // isLotado

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:generatedCorba/EstacionamentoController:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _EstacionamentoControllerStub