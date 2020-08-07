import java.awt.Color;

public class ChessBoardRenderer {
	public boolean isBlackSquare(int square) {
		if(square<8) {
		  if(square%2==0) {
  		System.out.println(square);
		return true;}
		  else {
			  return false;
		  }}
		else if(square>=8&&square<16){
			if(square%2==0) {
		  		System.out.println(square);
				return false;}
				  else {
					  return true;
				  }
		}
		else if(square>=16&&square<24){
			if(square%2==0) {
		  		System.out.println(square);
				return true;}
				  else {
					  return false;
				  }
		}
		else if(square>=24&&square<32){
			if(square%2==0) {
		  		System.out.println(square);
				return false;}
				  else {
					  return true;
				  }
		}
		else if(square>=32&&square<40){
			if(square%2==0) {
		  		System.out.println(square);
				return true;}
				  else {
					  return false;
				  }
		}
		else if(square>=40&&square<48){
			if(square%2==0) {
		  		System.out.println(square);
				return false;}
				  else {
					  return true;
				  }
		}
		else if(square>=48&&square<56){
			if(square%2==0) {
		  		System.out.println(square);
				return true;}
				  else {
					  return false;
				  }
		}
		else if(square>=56&&square<64){
			if(square%2==0) {
		  		System.out.println(square);
				return false;}
				  else {
					  return true;
				  }
		}
		return false;}}