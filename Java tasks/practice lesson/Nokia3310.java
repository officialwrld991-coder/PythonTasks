    import java.util.Scanner;

    public class Nokia3310 {
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
          break;
       case 2: System.out.println("Mesages");
          break;
       case 3: System.out.println("Chat");
          break;
       case 4: System.out.println("Call register");
          break;
      case 5: System.out.println("Tones");
          break;
      case 6: System.out.println("Settings");
          break;
      case 7: System.out.println("Call divert");
          break;
      case 8: System.out.println("Games");
          break;
      case 9: System.out.println("Calculator");
          break;
      case 10: System.out.println("Remainders");
          break;
       case 11: System.out.println("Clock");
          break;
      case 12: System.out.println("Profiles");
          break;
      case 13: System.out.println("SIM Services");
          break;
       default: System.out.println("Invalid number");
    }

       String phonebook = "1. Search\n 2. Service Nos\n 3. Add name\n 4. Erase\n 5. Edit\n Assign tone\n 7. Send b' card\n 8. Options\n 8i. Type of view\n 8ii. Memory status\n 9. Speed dails\n 10. Voice tags\n";
       
         System.out.print("Enter your phonebook option: ");
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
                  System.out.print("Enter menu options");
                  int optionsNum = input.nextInt();
                  switch (optionsNum) {
                   case 1: System.out.print("Type of view");
                   case 2: System.out.print("Memory status");
                  default:System.out.print("Invalid Number");
                     break;        
          case 9: System.out.println("Speed dials");
            break;
          case 10: System.out.println("Voice tags");
            break;
          default: System.out.println("invalid");
}
        
       String messages = "1. Write messages\n 2. Inbox\n 3. Outbox\n 4. Picture Messages\n 5. Templates\n 6. Smileys\n 7. Message settings\n 7i. Set\n 7ai. Message centre number\n Messages sent as\n Message validity\n 7ii. Common\n 7aii. Delivery report\n Reply via same centre\n character support\n 8. Info service\n 9. Voice mailbox number\n 10. Service command editor";
      
            System.out.print("Enter your Messages option: ");
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
                  System.out.print("Enter Message options");
                  int messagesNum = input.nextInt();
                  switch (messagesNum) {
                   case 1: System.out.print("Set");
                   case 2: System.out.print("Message centre number");
                   case 3: System.out.print("Message Validity");
                   case 4: System.out.print("Common");
                   case 5: System.out.print("Delivery Report");
                   case 6: System.out.print("Reply via same centre");
                   case 7: System.out.print("Character Support")
                  default:System.out.print("Invalid Number");
                     break;        
          case 8: System.out.println("Info Service");
            break;
          case 9: System.out.println("Voice mailbox Number");
            break;
          case 10: System.out.println("Service Command Editor");
            break;
          default: System.out.println("invalid");
}
               
       String chat = " ";

         System.out.print("Enter your Chat option: ");
          int chatNum = input.nextInt();


       String callRegister = "1. Missed calls\n 2. Recieved calls\n 3. Dailed numbers\n 4. Erase recent call list\n 5. Show call duration\n Last call duration\n All call duration\n Receieved call duration\n Dailed call duration\n Clear timer\n 6. Show call cost\n Last call cost\n All call cost\n Clear counters\n 7. Call cost settings\n call cost limit\n Show cost in\n 8. Prepaid cost\n ";
 
           System.out.print("Enter your Call register option: ");
          int callRegisterNum = input.nextInt();

        switch (callRegisterNum) {
         case 1: System.out.println("Missed Calls");
            break;
         case 2: System.out.println("Recieved Calls");
            break;
         case 3: System.out.println("Dailed Numbers");
            break;
         case 4: System.out.println("Erase Recent call list");
            break;
         case 5: System.out.println("Show Call Duration");
                 System.out.print("Enter Call options");
                  int callNum = input.nextInt();
                  switch (callNum) {
                   case 1: System.out.print("Last call duration");
                   case 2: System.out.print("All call duration");
                   case 3: System.out.print("Received call duration");
                   case 4: System.out.print("Dailed call duration");
                   case 5: System.out.print("Clear timer");
                  default:System.out.print("Invalid");
                     break;        
                    }
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
  
        String tones = "1. Ringing tone\n 2. Ringing volume\n 3. Incoming call alert\n 4. Composer\n 5. Message alert tone\n 6. Keypad tones\n 7. Warning and game tones\n 8. Vibrating alert\n 9. Screen saver\n";

           System.out.print("Enter your Tone option: ");
          int tonesNum = input.nextInt();

        switch (tonesNum) {
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

         String settings = "1. Call Settings\n Automatic redail\n Speed dailing\n Call waiting options\n Own number sending\n Phon line in use\n Automatic answer\n 2. Phone Settings\n Language\n Cell info display\n Welcome note\n Network selection\n Light\n Confirm SIM service actions\n 3. Security Settings\n PIN code request\n Call barring service\n fixed dailing\n Closed user group\n Phone security\n Change access codes 4. Resote factory settings";

             System.out.print("Enter your Settings option: ");
          int settingsNum = input.nextInt();

        switch (settingsNum) {
         case 1: System.out.println("Call Settings");
                 System.out.print("Enter Call Settings Option");
                 int callSettingsNum = input.nextInt();
                 switch (callSettingsNum) {
                  case 1: System.out.println("Automatic Redail");
                  case 2: System.out.println("Speed Dailing");
                  case 3: System.out.println("Call Waiting Options");
                  case 4: System.out.println("Own NUmber Sending");
                  case 5: System.out.println("Phone line in Use");
                  case 6: System.out.println("Automatic Answer");
                      break;              
                  }
         case 2: System.out.println("Phone Settings");
                 System.out.print("Enter Phone Settings Options");
                  int phoneSettingsNum = input.nextInt();
                  switch (phoneSettingsNum) {
                  case 1: System.out.println("Language");
                  case 2: System.out.println("Cell Info Display");
                  case 3: System.out.println("Welcome Note");
                  case 4: System.out.println("Network Selection");
                  case 5: System.out.println("Light");
                  case 6: System.out.println("Confirm SIM Service Action");
                      break;              
                  }
         case 3: System.out.println("Security Settings");
                 System.out.print("Enter Security Settings: ");
                 int securitySettNum = input.nextInt();
                 switch (securitySettNum) {
                  case 1: System.out.println("PIN Code Request");
                  case 2: System.out.println("Call Barring Service");
                  case 3: System.out.println("Fixed Dailing");
                  case 4: System.out.println("Closed User Group");
                  case 5: System.out.println("Phone Security");
                  case 6: System.out.println("Change Access Code");
                      break;              
                    }
         case 4: System.out.println("Restore Factory Settings");
            break;
         default: System.out.println("invalid");
            break;
                   }

        String callDivert = " ";
             
            System.out.print("Enter your Call Divert option: ");
          int divertNum = input.nextInt();

        String games = " ";

            System.out.print("Enter your Game option: ");
          int gamesNum = input.nextInt();

        String calculator = " ";

              System.out.print("Enter your Calculator option: ");
          int calculatorNum = input.nextInt();

        String remainder = " ";

              System.out.print("Enter your Remainder option: ");
          int remainderNum = input.nextInt();

        String clock = "1. Alarm clock\n 2. Clock settings\n 3. Date settings\n 4. Stop watch\n 5. Countdown timer\n 6. Auto update of date\n ";

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

        String profiles = " ";

                System.out.print("Enter your Profiles option: ");
          int profileNum = input.nextInt();

        String simServices = " ";
 
                   System.out.print("Enter your SIM Services option: ");
          int simServiceNum = input.nextInt();



       
     }






   }

  }
