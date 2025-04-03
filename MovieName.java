class MovieName {
    static void director(Movie movie) {
       if (movie == Movie.DDLJ) {
            System.out.println(movie + " directed by Aditya Chopra");
        } else if (movie == Movie.SHOLAY) {
            System.out.println(movie + " directed by Ramesh Sippy");
        } else if (movie == Movie.KANTARA) {
            System.out.println(movie + " directed by Rishab Shetty");
        } else if (movie == Movie.KGF) {
            System.out.println(movie + " directed by Prashanth Neel");
        } else if (movie == Movie.LUCIA) {
            System.out.println(movie + " directed by Pawan Kumar");
        }
    }
}
