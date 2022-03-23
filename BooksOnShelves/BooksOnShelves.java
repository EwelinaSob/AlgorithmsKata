

package zad3;


public class BooksOnShelves {
	private int n, k;
	public BooksOnShelves(int numOfBooks, int shelfCap) {
		n = numOfBooks;
		k = shelfCap;
	}

public int getNumOfShelves() {
	
	
	int NumOfShelves = n/k;
	int rest = n%k;

		if (rest != 0) {
			NumOfShelves = (n/k) + 1;
		}
		if (rest == 0) {
			NumOfShelves = (n/k);}
		
		return  NumOfShelves ;
	}


public int getBooksOnLastShelf() {
	
	int rest = n%k;
	int BooksOnLastShelf = rest;
	return BooksOnLastShelf;
}

	}



