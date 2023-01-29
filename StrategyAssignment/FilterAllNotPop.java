package Singletonassignment;

public class FilterAllNotPop implements GenreFilter{
	  @Override
	  public boolean permit(Album album){
	    return !album.genre().equals("Pop");
	  }
	}