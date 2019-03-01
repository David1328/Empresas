package empledos;

import DatosEmpleados.EmpleadosDatos;
import javax.swing.JOptionPane;

public class Empledos {
    
    public static void main(String[] args) {
        EmpleadosDatos emple1 = new EmpleadosDatos();
        EmpleadosDatos emple2 = new EmpleadosDatos();
        EmpleadosDatos emple3 = new EmpleadosDatos();
        EmpleadosDatos emple4 = new EmpleadosDatos();
        EmpleadosDatos emple5 = new EmpleadosDatos();
        int empleado;
        String desea;
        
        emple1.setNom(JOptionPane.showInputDialog("Ingrese el nombre del primer empleado"));
        emple1.setEdad(Short.parseShort(JOptionPane.showInputDialog("Ingrese su edad")));
        emple1.setDireccion(JOptionPane.showInputDialog("Ingrese la direccion "));
        emple1.setTelefono(JOptionPane.showInputDialog("Ingrese el telefono"));
        
        emple2.setNom(JOptionPane.showInputDialog("Ingrese el nombre del segundo empleado"));
        emple2.setEdad(Short.parseShort(JOptionPane.showInputDialog("Ingrese la edad del empleado")));
        emple2.setDireccion(JOptionPane.showInputDialog("Ingrese la direccion "));
        emple2.setTelefono(JOptionPane.showInputDialog("Ingrese el telefono"));
        
        emple3.setNom(JOptionPane.showInputDialog("Ingrese el nombre del tercer empleado"));
        emple3.setEdad(Short.parseShort(JOptionPane.showInputDialog("Ingrese la edad del empleado")));
        emple3.setDireccion(JOptionPane.showInputDialog("Ingrese la direccion "));
        emple3.setTelefono(JOptionPane.showInputDialog("Ingrese el telefono"));
        
        emple4.setNom(JOptionPane.showInputDialog("Ingrese el nombre del cuarto empleado"));
        emple4.setEdad(Short.parseShort(JOptionPane.showInputDialog("Ingrese la edad del empleado")));
        emple4.setDireccion(JOptionPane.showInputDialog("Ingrese la direccion "));
        emple4.setTelefono(JOptionPane.showInputDialog("Ingrese el telefono"));
        
        emple5.setNom(JOptionPane.showInputDialog("Ingrese el nombre del quinto empleado"));
        emple5.setEdad(Short.parseShort(JOptionPane.showInputDialog("Ingrese la edad del empleado")));
        emple5.setDireccion(JOptionPane.showInputDialog("Ingrese la direccion "));
        emple5.setTelefono(JOptionPane.showInputDialog("Ingrese el telefono"));
        
        do{
        empleado = Integer.parseInt(JOptionPane.showInputDialog("Menu de empleados:\n 1.Empleado "+emple1.getNom()+"(1)\n "
        +"2.Empleado "+emple2.getNom()+"(2)\n 3.Empleado "+emple3.getNom()+"(3)\n "
        +"4.Empleado "+emple4.getNom()+"(4)\n 5.Empleado "+emple5.getNom()+"(5)"));
        
        switch(empleado){
            case 1:
                JOptionPane.showMessageDialog(null,"El nombre del empleado es : "+emple1.getNom()
                +", su edad es: "+emple1.getEdad()+", su direccion "+emple1.getDireccion()
                +", su telefono"+emple1.getTelefono());
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"El nombre del empleado es : "+emple2.getNom()
                +", su edad es: "+emple2.getEdad()+", su direccion "+emple2.getDireccion()
                +", su telefono"+emple2.getTelefono());
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"El nombre del empleado es : "+emple3.getNom()
                +", su edad es: "+emple3.getEdad()+", su direccion "+emple3.getDireccion()
                +", su telefono"+emple3.getTelefono());
                break;
            case 4:
                JOptionPane.showMessageDialog(null,"El nombre del empleado es : "+emple4.getNom()
                +", su edad es: "+emple4.getEdad()+", su direccion "+emple4.getDireccion()
                +", su telefono"+emple4.getTelefono());
                break;
            case 5:
                JOptionPane.showMessageDialog(null,"El nombre del empleado es : "+emple5.getNom()
                +", su edad es: "+emple5.getEdad()+", su direccion "+emple5.getDireccion()
                +", su telefono"+emple5.getTelefono());
                break;
            default: JOptionPane.showMessageDialog(null,"Empleado no encontrado");
        }
        desea = JOptionPane.showInputDialog("Desea solicitar otro? (Si/No)");
        }while(desea.equals("Si")||desea.equals("si")||desea.equals("SI"));
    }
}