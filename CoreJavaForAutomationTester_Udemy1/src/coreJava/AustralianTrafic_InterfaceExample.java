package coreJava;

public class AustralianTrafic_InterfaceExample implements CentralTraffic_InterfaceExample,ContinentalTraffic_InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		CentralTraffic_InterfaceExample a= new AustralianTrafic_InterfaceExample();
		a.redStop();
		a.FlashYellow();
		a.greenGo();

		AustralianTrafic_InterfaceExample at=new AustralianTrafic_InterfaceExample();
		ContinentalTraffic_InterfaceExample ct=new AustralianTrafic_InterfaceExample();
		at.walkonsymbol();
		ct.Trainsymbol();


		}

		@Override
		public void redStop() {
		// TODO Auto-generated method stub
		System.out.println(" redstop implementation");
		}
		public void walkonsymbol()
		{
		System.out.println("walking");
		}
		@Override
		public void FlashYellow() {
		// TODO Auto-generated method stub
		System.out.println(" flash yellow implementation");
		//code
		}

		@Override
		public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println(" Green go implementation");
		}

		@Override
		public void Trainsymbol() {
		// TODO Auto-generated method stub

		}

		}

		
	


