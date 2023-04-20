public class EjemploAutomovilRelacionesObjetos {
    public static void main(String[] args) {
        Persona ab = new Persona("Albertt","Hdz");
        //Relacion con el objeto ruedas con los parametros correspondientes
        Automovil automovil = new Automovil("Subaru","Impreza");
        Rueda[] ruedas = new Rueda[10];
        for(int i = 0; i < ruedas.length; i++){
            //Inicializar en el constructor de la clase Automovil => this.ruedas = new Rueda[5];
            automovil.addRueda(new Rueda("YokoHama",16,7.5));
        }
        automovil.setConductor(ab);
        //automovil.setRuedas(ruedas);//Pasando el arreglo como parametro
        automovil.setTipo(TipoAutomovil.FURGON);
        automovil.setMotor(new Motor());
        automovil.setColor(Color.GRIS);
        Automovil.setColorPatente("Verde"); //Se accede con el nombre de la clase
        automovil.setEstanque(new Estanque(20));
        System.out.println(automovil.verDetalle());

        System.out.println("#####Otro objeto#####");
        Persona cd = new Persona("José","Peña");

        /*Rueda[] ruedasMazda = {new Rueda("Pirelli",18,8),
                new Rueda("Pirelli",18,8),
                new Rueda("Pirelli",18,8),
                new Rueda("Pirelli",18,8),
                new Rueda("Pirelli",18,8)};
         */
        Automovil mazda = new Automovil();
        //Metodos encadenados VB
        mazda.addRueda(new Rueda("Pirelli",18,11.5))
                        .addRueda(new Rueda("Pirelli",18,11.5))
                        .addRueda(new Rueda("Pirelli",18,11.5))
                        .addRueda(new Rueda("Pirelli",18,11.5))
                        .addRueda(new Rueda("Pirelli",18,11.5));
        mazda.setConductor(cd);
        //mazda.setRuedas(ruedasMazda);
        Automovil.setColorPatente("Rojo");
        mazda.setFabricante("NA");
        mazda.setModelo("Mazda");
        mazda.setTipo(TipoAutomovil.HATCHBACK);
        mazda.setMotor(new Motor());
        mazda.setColor(Color.NARANJO);
        mazda.setEstanque(new Estanque(20));//Setear o validar en la clase
        System.out.println(mazda.verDetalle());
        //TipoAutomovil tipo = automovil.getTipo().*
        //Visualizar los atributos del enumerador TipoAutomovil (Ver si se modifica antes)
        System.out.println("tipo = " + automovil.getTipo().getNumeroPuertas());
        System.out.println("Conductor " + mazda.getConductor().toString()); //No tenemos ni getter ni setter
        System.out.println("Ruedas :" );
        for(Rueda r: mazda.getRuedas()){
            System.out.println("Fabricante = " + r.getFabricante() +
                    "Aro = " + r.getAro() + "Ancho = " + r.getAncho());
        }

        Automovil[] autos = new Automovil[2];
        autos[0] = automovil;
        autos[1] = mazda;

        for(int i = 0; i < autos.length; i++){
            System.out.println(autos[i]);
        }
    }
}
