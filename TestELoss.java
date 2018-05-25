import java.io.*;

public class TestELoss
{
   EnergyLoss testE1= new EnergyLoss ("iron", 26.0, 55.85, 7.87, 206.0);
   EnergyLoss testE2= new EnergyLoss ("iron", 26.0, 55.85, 7.87, 300.0);
   EnergyLoss testE3= new EnergyLoss ("iron", 26.0, 55.85, 7.87, 3000.0);
   EnergyLoss testE4= new EnergyLoss ("iron", 26.0, 55.85, 7.87, 10000.0);
   EnergyLoss testE5= new EnergyLoss ("iron", 26.0, 55.85, 7.87, 30000.0);
   EnergyLoss testE6= new EnergyLoss ("iron", 26.0, 55.85, 7.87, 100000.0);
   double beta= testE1.getBeta();
}
