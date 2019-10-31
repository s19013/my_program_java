public class test
{
  public static void main(String[] args)
  {
    master.ready();
    master.member();
    master.gameloop();
  }
}



// public static int rs1;
// public static int rs2;
// public static int rs3;
// public static int cs1;
// public static int cs2;
// public static int cs3;
// public static int xs1;
// public static int xs2;

// for(int i = 0; i <3; i++)
// {
//   rs1 += ir1.get(i);
//   rs2 += ir2.get(i);
//   rs3 += ir3.get(i);
//   switch (i)
//   {
//     case 0:
//       cs1 += ir1.get(0);
//       cs2 += ir1.get(1);
//       cs3 += ir1.get(2);
//       xs1 += ir1.get(0);
//       xs2 += ir1.get(2);
//       break;
//     case 1:
//       cs1 += ir2.get(0);
//       cs2 += ir2.get(1);
//       cs3 += ir2.get(2);
//       xs1 += ir2.get(1);
//       xs2 += ir2.get(1);
//       break;
//     case 2:
//       cs1 += ir3.get(0);
//       cs2 += ir3.get(1);
//       cs3 += ir3.get(2);
//       xs1 += ir3.get(2);
//       xs2 += ir3.get(0);
//       break;
//   }
// }
// if  (
//       rs1 == 3 ||
//       rs2 == 3 ||
//       rs3 == 3 ||
//       cs1 == 3 ||
//       cs2 == 3 ||
//       cs3 == 3 ||
//       xs1 == 3 ||
//       xs2 == 3
//     )
// {
//   db();
//   winner.youwin();
// }
// else if (
//           rs1 == -3 ||
//           rs2 == -3 ||
//           rs3 == -3 ||
//           cs1 == -3 ||
//           cs2 == -3 ||
//           cs3 == -3 ||
//           xs1 == -3 ||
//           xs2 == -3
//         )
// {
//   db();
//   winner.comwin();
// }
