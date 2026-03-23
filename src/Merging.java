import java.util.Arrays;

public class Merging {
    public void sorted( int [] tableau1 ){
        Arrays.sort( tableau1 );
        System.out.println(Arrays.toString( tableau1 ) );

    }

    public int [] mergeArray( int [] tabo1, int [] tabo2 ) {
        int k = tabo1.length + tabo2.length ;
        int n = 0 ;
        int [] res = new int [ k ] ;
        for( int i = 0 ; i < tabo1.length ; i++ ){
            res [ n++ ] = tabo1 [ i ] ;
        }

        for ( int j = 0 ; j < tabo2.length ; j++ ) {
            res [ n++ ] = tabo2 [ j ] ;
        }

        //
        return res;

    }
    public int [] deletDuplicatMerge ( int [] tab , int [] tab1 ) {
        int [] mg =  mergeArray( tab , tab1 );
        Arrays.sort( mg );
        int k = 0 ;
        int [] del = new int [mg.length] ;
        del [ k ] = mg [ 0 ] ;
        for( int i = 1 ; i < mg.length ; i++ ) {
            if( mg [ i ] != mg [ i-1 ] ) {
                del [ ++k ] = mg [ i ] ;
            }
        }

        return Arrays.copyOf ( del ,k+1 ) ;

    }
}
