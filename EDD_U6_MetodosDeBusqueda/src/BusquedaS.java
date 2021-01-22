
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chuy4
 */
public class BusquedaS {
    
    private int A[] = new int[0];

    public boolean Generar(){
        int tam = Integer.parseInt(JOptionPane.showInputDialog("¿CUANTOS NUMEROS DESEA GENERAR"));
        A = new int [tam];
        for(int i =0; i < A.length; i++){
            A[i] = (int)(Math.random()*1000);
            for(int s = 0;s < i; s++ ){
                if (A[i] == A[s]){
                    A[i] = (int)(Math.random()*100);
                }
            }
        }
        return true;
    }
       
    public int busquedaS(int arreglo[],int elemento){
        for(int i = 0;i < arreglo.length ; i++){
            if(elemento == arreglo[i]){

                return i+1;
            }

        }
        return -1;
    }
    
    public int busquedaB(int arreglo[],int elemento){
        int y,z,m,valor;
        y = 0;
        z = arreglo.length-1;
        while (y <= z) {
            m = (y + z)/2;
            valor = arreglo[m];
            if(elemento == valor){
                return m+1;
            }else if(elemento < valor){
                z = m - 1;
            }else if(elemento > valor){
                y = m + 1;
            }
            
        }
        return -1;
    }    
    public boolean ordenado(int arreglo[]){
        for(int i =0;i < arreglo.length-1;i++){
            if (arreglo[i] > arreglo[i+1]){
                return false;
            }
        }
        return true;
    }
    
    public boolean ordenar(int arreglo[]){
        int salto,j,k,auxiliar;
        salto = arreglo.length/2;
        while(salto > 0){
            for(int i = salto; i < arreglo.length;i++){
                j = i - salto;
                while(j >=0){
                    k = j + salto;
                    if(arreglo[j] <= arreglo[k]){
                        j = -1;
                    } else {
                        auxiliar = arreglo[j];
                        arreglo[j] = arreglo[k];
                        arreglo[k] = auxiliar;
                        j -= salto;
                    }
                }
                
            }
            salto = salto/2;
        }
        return true;
    }
    
    public int[] CopiaA(){
        return A;
    }
}
