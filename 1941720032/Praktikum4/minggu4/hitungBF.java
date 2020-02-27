/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu4;

/**
 *
 * @author USER
 */
public class hitungBF {

    int min, max;
    
    int hasil[] = new int[2];

    int[] nilai(int a[]) {
        min = a[0];
        max = a[0];

        for (int i = 0; i < 5; i++) {
            if (a[i] < min) {
                min = a[i];
            } else if (a[i] > max) {
                max = a[i];
            }
        }
        
        hasil[0] = min;
        hasil[1] = max;
        return hasil;
    }
}
