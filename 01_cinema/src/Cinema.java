import java.util.ArrayList;

import java.util.Scanner;

public class Cinema {

	
	 public static void main(String[] args) {
		 
	        Movie movie1 = new Movie("영화 A", "12:00");
	        Movie movie2 = new Movie("영화 B", "15:00");

	        Theater theater1 = new Theater("상영관 1", movie1, 5, 5);
	        Theater theater2 = new Theater("상영관 2", movie2, 5, 5);

	        ArrayList<Theater> theaters = new ArrayList<>();
	        theaters.add(theater1);
	        theaters.add(theater2);

	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("영화관 예약 시스템");
	            System.out.println("1. 영화 목록 보기");
	            System.out.println("2. 좌석 예약");
	            System.out.println("3. 좌석 배치 보기");
	            System.out.println("4. 종료");
	            System.out.print("선택: ");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.println("영화 목록:");
	                    for (int i = 0; i < theaters.size(); i++) {
	                        System.out.println((i + 1) + ". " + theaters.get(i).getMovie());
	                    }
	                    break;
	                case 2:
	                    System.out.print("상영관 번호 선택: ");
	                    int theaterIndex = scanner.nextInt() - 1;
	                    System.out.print("예약할 좌석 (행 번호, 열 번호): ");
	                    int row = scanner.nextInt();
	                    int col = scanner.nextInt();
	                    if (theaterIndex >= 0 && theaterIndex < theaters.size()) {
	                        theaters.get(theaterIndex).reserveSeat(row, col);
	                    } else {
	                        System.out.println("잘못된 상영관 번호입니다.");
	                    }
	                    break;
	                case 3:
	                    System.out.print("상영관 번호 선택: ");
	                    theaterIndex = scanner.nextInt() - 1;
	                    if (theaterIndex >= 0 && theaterIndex < theaters.size()) {
	                        theaters.get(theaterIndex).showSeating();
	                    } else {
	                        System.out.println("잘못된 상영관 번호입니다.");
	                    }
	                    break;
	                case 4:
	                    System.out.println("시스템을 종료합니다.");
	                    scanner.close();
	                    return;
	                default:
	                    System.out.println("잘못된 선택입니다.");
	            }
	        }
	    }
	
	
	
	
	class Movie {
	    private String title;
	    private String time;

	    public Movie(String title, String time) {
	        this.title = title;
	        this.time = time;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public String getTime() {
	        return time;
	    }

	    @Override
	    public String toString() {
	        return title + " (" + time + ")";
	    }
	}

	class Theater {
	    private String name;
	    private Movie movie;
	    private boolean[][] seats;

	    public Theater(String name, Movie movie, int rows, int cols) {
	        this.name = name;
	        this.movie = movie;
	        this.seats = new boolean[rows][cols];
	    }

	    public String getName() {
	        return name;
	    }

	    public Movie getMovie() {
	        return movie;
	    }

	    public boolean reserveSeat(int row, int col) {
	        if (row < 0 || row >= seats.length || col < 0 || col >= seats[0].length) {
	            System.out.println("잘못된 좌석 번호입니다.");
	            return false;
	        }
	        if (seats[row][col]) {
	            System.out.println("이미 예약된 좌석입니다.");
	            return false;
	        }
	        seats[row][col] = true;
	        return true;
	    }

	    public void showSeating() {
	        System.out.println("좌석 배치:");
	        for (int i = 0; i < seats.length; i++) {
	            for (int j = 0; j < seats[i].length; j++) {
	                if (seats[i][j]) {
	                    System.out.print("[X] ");
	                } else {
	                    System.out.print("[O] ");
	                }
	            }
	            System.out.println();
	        }
	    }
	}

	public class CinemaReservation {
	   
	}
	

	
	
	
	
	
	
	
}
	
	

