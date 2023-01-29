package Singletonassignment;

public class OnlyPop implements GenreFilter{
  
	@Override
  public boolean permit(Album album){
    return album.genre().equals("Pop");
  }
}