public class EjemploAutomovil {
    public static void main(String[] args) {
        Automovil automovil = new Automovil("Subaru","Impreza");
        //Motor motor = new Motor(2.0,TipoMotor.BENCINA);
        automovil.setTipo(TipoAutomovil.FURGON);
        automovil.setMotor(new Motor(2.0,TipoMotor.BENCINA));//Se pasa el objeto en el set motor
        automovil.setColor(Color.AZUL);
        automovil.setEstanque(new Estanque());
        System.out.println(automovil);
        System.out.println(automovil.toString());
        System.out.println(automovil.verDetalle());
        System.exit(0);
        System.out.println(automovil.acelerarFrenar(3000));
        System.out.println("Kilometros por litro " + automovil.calcularConsumo(30, 0.6f));
        System.out.println("Kilometros por litro " + automovil.calcularConsumo(30, 60));
        Automovil nissan1 = new Automovil("Nissan", "MT200",Color.GRIS,new Motor(3.0,TipoMotor.DISESL), new Estanque());
        Automovil nissan2 = new Automovil("Nissan", "MT200",Color.ROJO,new Motor(3.0,TipoMotor.BENCINA), new Estanque());
        //Se modifican los argumentos pasando el constructor directamente
        System.out.println("Son iguales? " + (nissan1.equals(nissan2)));
    }
}
