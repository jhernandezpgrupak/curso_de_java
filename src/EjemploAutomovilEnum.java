public class EjemploAutomovilEnum {
    public static void main(String[] args) {
        Automovil automovil = new Automovil("Subaru","Impreza");
        automovil.setMotor(new Motor(2.0,TipoMotor.BENCINA));//Se pasa el objeto en el set motor
        automovil.setTipo(TipoAutomovil.FURGON);
        //automovil.setEstanque(new Estanque());
        automovil.setColor(Color.GRIS);
        Automovil.setColorPatente("Verde"); //Se accede con el nombre de la clase
        System.out.println(automovil.verDetalle());
        //Llamando a un metodo estatico con el nombre de la clase
        //Automovil.setCapacidadTanqueStatico(80);
        //System.out.println("Kilometros por litros :" + Automovil.calcularConsumoEstatico(300,60));
        System.out.println("#####Otro objeto#####");
        Automovil mazda = new Automovil();
        Automovil.setColorPatente("Rojo");
        mazda.setFabricante("NA");
        mazda.setModelo("Mazda");
        mazda.setTipo(TipoAutomovil.HATCHBACK);
        mazda.setMotor(new Motor(2.0,TipoMotor.DISESL));
        mazda.setColor(Color.NARANJO);
        System.out.println(mazda.verDetalle());
        //TipoAutomovil tipo = automovil.getTipo().*
        //Visualizar los atributos del enumerador TipoAutomovil (Ver si se modifica antes)
        System.out.println("tipo = " + automovil.getTipo().getNumeroPuertas());

        //Arreglo de tipo (TipoAutomovil Enum)
        TipoAutomovil[] tipo = TipoAutomovil.values();

        for (TipoAutomovil ta: tipo){
            System.out.print(ta + "=>" + ta.name() + "," +
                    ta.getNombre() + "," +
                    ta.getDescripcion() + "," +
                    ta.getNumeroPuertas());
            System.out.println();
        }
    }
}
