public class ArrayTraining {

    /**
     * @param n size of the array, eg: 3
     * @return an empty int array of size n, eg: {0, 0, 0}
     */
    public int[] emptyIntArray(int n) {
    	
    	int[] n2 = new int[n];
    	
        return n2;
    }

    /**
     * @param n size of the array, eg: 2
     * @return an empty String array of size n, eg: {null, null}
     */
    public String[] emptyStringArray(int n) {
    	String[] n2 = new String[n];
        return n2;
    }

    /**
     * @param a first value, eg: 3
     * @param b second value, eg: 2
     * @param c third value, eg: 1
     * @return an int array with a, b and c values, eg: {3, 2, 1}
     */
    public int[] intArray(int a, int b, int c) {
    	int[] n2 = {a,b,c};
        return n2;
    }

    /**
     * @param a first value, eg: "test"
     * @param b second value, eg: "sample"
     * @param c third value, eg: "value"
     * @return a String array with a, b and c values,
     * eg: {"test", sample", "value"}
     */
    public String[] stringArray(String a, String b, String c) {
    	String [] n2 = {a,b,c};
        return n2;
    }

    /**
     * @param array, eg: {1, 2, 3}
     * @return length of the array, eg: 1
     */
    public int length(int[] array) {
    	
        int n2 = array.length;
    	
        return n2;
    }

    /**
     * @param array, eg: {3, 2, 1}
     * @return first value of the array, eg: 3
     */
    public int firstValue(int[] array) {
    	int value = array[0];
        return value;
    }

    /**
     * @param array, eg: {3, 2, 1}
     * @return last value of the array, eg: 1
     */
    public int lastValue(int[] array) {
    	
        int value = array[array.length -1];
        return value;
    }

    /**
     * @param array,    eg: {3, 2, 1}
     * @param position, eg: 1
     * @return value of the array at position, eg: 2
     */
    public int valueAtPosition(int[] array, int position) {
    	int value = array[position];
        return value;
    }

    /**
     * @param array,    eg: {3, 8, 5}
     * @param value,    eg: 4
     * @param position, eg: 1
     * @return the array with the value replaced at position, eg: {3, 4, 5}
     */
    public int[] replace(int[] array, int value, int position) {
    	array[position] = value;
        return array;
    }

    /**
     * @param array, eg: {1, 2, 3}
     * @return sum of values of the array, eg: 6
     */
    public int sum(int[] array) {
    	int somme = 0;
    	for( int value : array) {
    		somme = somme + value; 
    	}
        return somme;
    }

    /**
     * @param array,  eg: {1, 2, 3}
     * @param search, eg: 2
     * @return if array contains searched value, eg: true
     */
    public boolean contains(int[] array, int search) {
    	for( int value : array) {
    		if(value == search) {
    			return true;
    		}
    	}
        return false;
    }

    /**
     * @param array, eg: {"sample", "value"}
     * @return array where all words are capitalized, eg: {"Sample", "Value"}
     */
    public String[] capitalize(String[] array) {
    	int i = 0;
    	for(String word : array) {
    		String toto = word.substring(0, 1).toUpperCase()+ word.substring(1);
    		array[i] = toto;
    		i++;
    	}
        return array;
    }

    /**
     * @param first,  eg: {1, 2, 3}
     * @param second, eg: {3, 2, 1}
     * @return if values in first and second arrays, in the same position,
     * are equals, eg: false
     */
    public boolean equals(int[] first, int[] second) {
    		first.equals(second);
    		return true;
    	
        
    }

    /**
     * @param array, eg: {1, 2, 3}
     * @return array with reversed values, eg: {3, 2, 1}
     */
    public int[] reverse(int[] array) {
    	
    	 int longueur = array.length;
    	 int[] tab = new int[longueur]; 
         int j = longueur; 
         
         for (int i = 0; i < longueur; i++) { 
             tab[j - 1] = array[i]; 
             j = j - 1; 
         } 
   
         
    	
    	 return tab;
    }

    /**
     * @param first,  eg: {1, 2, 3}
     * @param second, eg: {4, 5}
     * @return concatenates first and second values in one array,
     * eg: {1, 2, 3, 4, 5}
     */
    public int[] concat(int[] first, int[] second) {
        int[] newTab = new int[first.length + second.length];
        int f = 0;
        for(int i = 0; i<first.length; i++) {
        	newTab[i] = first[i];
        	f++;
        }
        
        for(int j = 0; j<second.length; j++) {
        	newTab[f + j] = second[j];
        }
        
        
        
        
        return newTab;
    }
}
