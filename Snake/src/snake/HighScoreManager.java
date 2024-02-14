package snake;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HighScoreManager {
	private static final String FILE_PATH = "D:\\Documents\\Projects\\MYPROJECTS\\Snake\\src\\snake\\highscores.txt";
	
	public static void saveHighScore(int score) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))){
			writer.write(Integer.toString(score));
			writer.newLine();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static List<HighScoreEntry> getHighScore(){
		List<HighScoreEntry> highScores = new ArrayList<>();
		
		 try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	            	String[] parts = line.split(" ");
	            	if (parts.length == 2) {
	            		int score = Integer.parseInt(parts[1]);
	            		highScores.add(new HighScoreEntry(score));
	            	}
			}
	            }
	     catch (IOException e) {
	                e.printStackTrace();
	     }
		 
		 //Sort High Scores in descending order
		 Collections.sort(highScores, Collections.reverseOrder());
		 
		 return highScores; 
		}
	

/*public static void main(String[] args) {
    // Example usage
    // saveHighScore( 1500);
    // saveHighScore( 1200);

    List<HighScoreEntry> highScores = getHighScore();
    System.out.println("High Scores:");
    for (HighScoreEntry entry : highScores) {
        System.out.println( entry.getScore());
    }
}*/
}

class HighScoreEntry implements Comparable<HighScoreEntry>{
	private int score;
	
	public HighScoreEntry(int score) {
		this.score = score;
	}
	
	public int getScore() {
		return score;
	}

	@Override
	public int compareTo(HighScoreEntry other) {
		//compare in descending order
		return Integer.compare(other.score, this.score);
	}
}
