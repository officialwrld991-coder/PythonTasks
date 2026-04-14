    import java.util.Scanner;

    public class Nokia {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    String phoneMenu = """

     NOKIA 3310 PHONE MENU

      1. Phone book:  
      
      2. Messages:

      3. Chat:

      4. Call register:

      5. Tones:

      6. Settings:

      7. Call divert:

      8. Games:

      9. Calculator:

      10. Remainder:

      11. Clock:

      12. Profiles:

      13. Sim Services:
  """;
     System.out.println(phoneMenu);

     System.out.print("Enter your Menu Number: ");
     int menuChoice = input.nextInt();

    switch (menuChoice) {
      case 1: System.out.println("Phone Book");
             System.out.print("Enter Phonebook Option: ");
             int phonebookNum = input.nextInt();
   
            switch (phonebookNum) {
          case 1: System.out.println("Search");
            break;
         case 2: System.out.println("Service No");
            break;
         case 3: System.out.println("Add name");
            break;
         case 4: System.out.println("Erase");
            break;
         case 5: System.out.println("Edit");
            break;
          case 6: System.out.println("Assign tone");
            break;
          case 7: System.out.println("Send b card");
            break;
          case 8: System.out.println("Options");
                  System.out.print("Enter menu options: ");
                  int optionsNum = input.nextInt();
                  switch (optionsNum) {
                   case 1: System.out.print("Type of view");
                        break;
                   case 2: System.out.print("Memory status");
                      break;
                  default:System.out.print("Invalid Number");
                           
                   }
            break;
          case 9: System.out.println("Speed dials");
            break;
          case 10: System.out.println("Voice tags");
            break;
          default: System.out.println("invalid");          
           
            }

          break;

         case 2: System.out.println("Mesages");
                 System.out.print("Enter Messages Option: ");
                 int messagesNum = input.nextInt();
           switch (messagesNum) {
           case 1: System.out.println("Write Messages");
             break;
           case 2: System.out.println("Inbox");
             break;
           case 3: System.out.println("Outbox");
             break;
           case 4: System.out.println("Picture Messages");
             break;
           case 5: System.out.println("Templates");
             break;
           case 6: System.out.println("Smileys");
             break;
           case 7: System.out.println("Message Settings");
                  System.out.print("Enter Message Settings options");
                  int settingsNum = input.nextInt();
                  switch (settingsNum) {
                   case 1: System.out.print("Set");
                       break;
                   case 2: System.out.print("Message centre number");
                       break;
                   case 3: System.out.print("Message Validity");
                        break;
                   case 4: System.out.print("Common");
                         break;
                   case 5: System.out.print("Delivery Report");
                         break;
                   case 6: System.out.print("Reply via same centre");
                          break;
                   case 7: System.out.print("Character Support");
                          break;
                  default:System.out.print("Invalid Number");
                    }
                       break;
         case 8: System.out.println("Info Service");
           break;
         case 9: System.out.println("Voice mailbox Number");
           break;
         case 10: System.out.println("Service Command Editor");
           break;
        default: System.out.println("invalid");
               }
             break;
      
       case 3: System.out.println("Chat");
               System.out.print("Enter Chat Options: ");
               int chatOptions = input.nextInt();
            break;


       case 4: System.out.println("Call register");
               System.out.print("Enter Call Register Options");
               int registerNum = input.nextInt();
              switch (registerNum) {
         case 1: System.out.println("Missed Calls");
            break;
         case 2: System.out.println("Recieved Calls");
            break;
         case 3: System.out.println("Dailed Numbers");
            break;
         case 4: System.out.println("Erase Recent call list");
            break;
         case 5: System.out.println("Show Call Duration");
                 System.out.print("Enter Call options: ");
                  int callNum = input.nextInt();
                  switch (callNum) {
                   case 1: System.out.print("Last call duration");
                      break;
                   case 2: System.out.print("All call duration");
                      break;
                   case 3: System.out.print("Received call duration");
                      break;
                   case 4: System.out.print("Dailed call duration");
                      break;
                   case 5: System.out.print("Clear timer");
                      break;
                  default:System.out.print("Invalid");
                       }
                     break;
          case 6: System.out.println("Show call cost");
            break;
          case 7: System.out.println("Call cost Settings");
            break;
          case 8: System.out.println("Call cost limit");
            break;
          case 9: System.out.println("Show Cost In");
            break;      
          case 10: System.out.println("Prepaid Cost");
            break;
          default: System.out.println("invalid");
                  }    
                  break;


      case 5: System.out.println("Tones");
              System.out.print("Enter Tone Settings: ");
              int toneNum = input.nextInt();
              switch (toneNum) {
         case 1: System.out.println("Ringing Tone");
            break;
         case 2: System.out.println("Ringing Volume");
            break;
         case 3: System.out.println("Incoming Call Alert");
            break;
         case 4: System.out.println("Composer");
            break;
         case 5: System.out.println("Message Alert Tone");
            break;
          case 6: System.out.println("Keypad tone");
            break;
          case 7: System.out.println("Warning and Game Tone");
            break;
          case 8: System.out.println("Vibrating Alert");
            break;
          case 9: System.out.println("Screen Saver");
            break;
          default: System.out.println("invalid");
               }
             break;


      case 6: System.out.println("Settings");
              System.out.print("Enter Settings Options: ");
              int settingsNum = input.nextInt();
             switch (settingsNum) {
      case 1: System.out.println("Call Settings");
                 System.out.print("Enter Call Settings Option");
                 int callSettingsNum = input.nextInt();
                 switch (callSettingsNum) {
                  case 1: System.out.println("Automatic Redail");
                     break;
                  case 2: System.out.println("Speed Dailing");
                      break;
                  case 3: System.out.println("Call Waiting Options");
                       break;
                  case 4: System.out.println("Own NUmber Sending");
                       break;
                  case 5: System.out.println("Phone line in Use");
                       break;
                  case 6: System.out.println("Automatic Answer");
                       break;
                     default: System.out.println("Invalid");
                         }
                      break;              
                  
      case 2: System.out.println("Phone Settings");
                 System.out.print("Enter Phone Settings Options");
                  int phoneSettingsNum = input.nextInt();
                  switch (phoneSettingsNum) {
                  case 1: System.out.println("Language");
                     break;
                  case 2: System.out.println("Cell Info Display");
                      break;
                  case 3: System.out.println("Welcome Note");
                       break;
                  case 4: System.out.println("Network Selection");
                       break;
                  case 5: System.out.println("Light");
                        break;
                  case 6: System.out.println("Confirm SIM Service Action");
                      break;            
                   default: System.out.println("Invalid");                    
                        }
                       break;

       case 3: System.out.println("Security Settings");
                 System.out.print("Enter Security Settings: ");
                 int securitySettNum = input.nextInt();
                 switch (securitySettNum) {
                  case 1: System.out.println("PIN Code Request");
                      break;
                  case 2: System.out.println("Call Barring Service");
                    break;
                  case 3: System.out.println("Fixed Dailing");
                     break;
                  case 4: System.out.println("Closed User Group");
                      break;
                  case 5: System.out.println("Phone Security");
                      break;
                  case 6: System.out.println("Change Access Code");
                      break;              
                    default: System.out.println("Invalid");
                    }
                     break;

       case 4: System.out.println("Restore Factory Settings");
            break;
         default: System.out.println("invalid");
                  }
                 break;
        
      case 7: System.out.println("Call divert");
               System.out.print("Enter your Call Divert option: ");
               int divertNum = input.nextInt();
          break;


      case 8: System.out.println("Games");
              System.out.print("Enter your Game option: ");
              int gamesNum = input.nextInt();
          break;


      case 9: System.out.println("Calculator");
              System.out.print("Enter your Calculator option: ");
              int calculatorNum = input.nextInt();
          break;

      case 10: System.out.println("Remainders");
               System.out.print("Enter your Remainder option: ");
               int remainderNum = input.nextInt();
          break;


       case 11: System.out.println("Clock");
                System.out.print("Enter your Clock option: ");
                int clockNum = input.nextInt();
                switch (clockNum) {
                case 1: System.out.println("Alarm Clock");
                    break;
                 case 2: System.out.println("Clock Settings");
                    break;
                 case 3: System.out.println("Date Settings");
                     break;
                 case 4: System.out.println("Stop Watch");
                    break;
                 case 5: System.out.println("Countdown Timer");
                     break;
                 case 6: System.out.println("Auto Update of Date");
                     break;
         default: System.out.println("invalid");
                     }
                   break;

      case 12: System.out.println("Profiles");
                System.out.print("Enter your Profiles option: ");
                int profileNum = input.nextInt();
          break;


      case 13: System.out.println("SIM Services");
               System.out.print("Enter your SIM Services option: ");
               int simServiceNum = input.nextInt();
          break;
       default: System.out.println("Invalid number");
    }
           
            
     }
   }

  

