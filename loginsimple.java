private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {                                            

   //Sección1
   char clave[]=jpassClave.getPassword();

   //Sección 2
   String clavedef=new String(clave);


  //Sección 3
  if (txtUsuario.getText().equals("Administrador") && clavedef.equals("12345")){

         //S3 línea 1
         this.dispose();

         //S3 línea 2
         JOptionPane.showMessageDialog(null, "Bienvenido\n Has ingresado "
         + "satisfactoriamente al sistema", "Mensaje de bienvenida",
         JOptionPane.INFORMATION_MESSAGE);

         //S3 línea 3
         Formulario1 formformulario1 = new Formulario1();

         //S3 línea 4
         formformulario1.setVisible(true);


   
   }else {


          //S3 línea 5
          JOptionPane.showMessageDialog(null, "Acceso denegado:\n"
          + "Por favor ingrese un usuario y/o contraseña correctos",  
          "Acceso denegado", JOptionPane.ERROR_MESSAGE);
            

       }


}                                           
