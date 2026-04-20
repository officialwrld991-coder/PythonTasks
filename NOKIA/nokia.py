nokia_menu = """
    NOKIA 3310 MENU::
    1. Phonebook
    2. Messages
    3. Chat
    4. Call Register
    5. Tones
    6. Settings
    7. Call divert
    8. Games
    9. Calculator
    10. Remainders
    11. Clock
    12. Profiles
    13. SIM Services
    """
print(nokia_menu)

user_input = int(input("Enter your Menu Choice: "))

match user_input:
    case 1:
        phonebook_menu = """
        1. Search
        2. Service No's
        3. Add name
        4. Earse
        5. Edit
        6. Assign Tone
        7. Send b' card
        8. Options
        9. Speed Dail
        10. Voice  Tag
        Enter 0 to go back
        """
        print(phonebook_menu)

        phone_book = int(input("Enter Phonebook Settings: "))
        match phone_book:
            case 0:
                print(nokia_menu)
            case 8:
                options = """
            1. Type of View
            2. Memory Status
            Enter 0 to go back
                    """
                print(options)
                option_menu = int(input("Enter Options Settings: "))
                if (option_menu == 0):
                    print(nokia_menu)
                else:
                    print("Invalid Number")
        
            case _:
                print("Invalid Number")
        
        
        
     
    
    
    case 2: 
        messages = """
        1. Write Messages
        2. Inbox
        3. Outbox
        4. Picture Messages
        5. Templates
        6. Smileys
        7. Message Settings
        8. Info Service
        9. Voice Mailbox number
        10. Service Command Editor
        Enter 0 to go back
            """
        print(messages)
        messages_input = int(input("Enter messages option: "))
        match messages_input:
            case 0: 
                print(nokia_menu)
            case 7: 
                message_settings = """
                1. Set.
                2. Common
                Enter 0 to go back
                """
                print(message_settings)
                message_options = int(input("Enter Messages Settings Option: "))
                match message_options:
                    case 1: 
                        sett = """
                        1. Message Centre Number
                        2. Messages sent as
                        3. Message Validity
                        Enter 0 to go back
                        """
                        print(sett)
                        sett_number = int(input("Enter Set option: "))
                        if sett_number == 0:
                            print(message_settings)
                        else:
                            print("Invalid Input")
                    case 2: 
                        common = """
                        1. Delivery reports
                        2. Reply via Same Centre
                        3. Character Support
                        Enter 0 to go back
                        """
                        print(common)
                        common_number = int(input("Enter Common Option: "))
                        if common_number == 0:
                            print(message_settings)
                        else:
                            print("Invalid Input")
                    case 0: 
                        print(messages)
                    case _:
                        print("Invalid Input")
            case _:
                print("Invalid Input")
     
        
    case 3:
        print("Chat")
    
    
    case 4:
        call_register = """
        1. Missed Calls
        2. Recieved Calls
        3. Dailed Numbers
        4. Erase Recent Call Lists
        5. Show Call Duration
        6. Show Call Cost
        7. Call Cost Settings
        8. Prepaid Credit
        Enter 0 to go back
        """
        print(call_register)       
        call_input = int(input("Enter your Call Register Settings: "))
        match call_input:
            case 0:
                print(nokia_menu)
            case 5:
                call_duration = """
                1. Last Call Duration
                2. All Call Duration
                3. Received Call Duration
                4. Dailed Call Duration
                5. Clear Timers
                Enter 0 to go back
                """
                print(call_duration)
                call_duration_input = int(input("Enter Call Duration Option: "))
                if call_duration_input == 0:
                    print(call_register)
                else:
                    print("Invalid Input")
            
            case 6:
                call_cost: """
                1. Last Call Cost
                2. All Call Cost
                3. Clear Counters
                Enter 0 to go back
                """
                print(call_cost) 
                call_cost_input = int(input("Enter your Call Cost Option: "))
                if call_cost_input == 0:
                    print(call_register)
                else:
                    print("Invalid Input")
                    
            case 7:
                call_cost_settings = """
                1. Call Cost Limit
                2. Show Costs In
                Enter 0 to go back
                """
                print(call_cost_settings)
                if call_cost_settings == 0:
                    print(call_register)
                else:
                    print("Invalid Input")
            case _:
                print("Invalid Input")                   
        
    case 5:
        tones = """
            1. Ringing Tone
            2. Ringing Volume
            3. Incoming Call Alert
            4. Composer
            5. Message Alert Tone
            6. Keypad Tones
            7. Warning and Games Tones
            8. Vibrating Alert
            9. Screen Saver
            Enter 0 to go back
            """
        print(tones)
        tones = int(input("Enter Tones Option: "))
        if tones == 0:
            print(nokia_menu)
        else:
            print("Invalid Option")
    
    case 6:
        settings = """
        1. Call Settings
        2. Phone Settings
        3. Security Settings
        4. Phone Factory Settngs
        Enter 0 to go back
        """
        print(settings)
        settings_input = int(input("Enter Settings Options: "))
        match settings_input:
            case 0: 
                print(nokia_menu)
            case 1: 
                call_settings = """
                1. AUtomatic Redail
                2. Speed Dailing
                3. Call Waiting Options
                4. Own Number Sending
                5. Phone Line in Use
                6. Automatic Answer
                Enter 0 to go back
                """
                print(call_settings)
                call_settings_option = int(input("Enter Call Setting Option: "))
                if call_settings_option == 0:
                    print(settings)
                else:
                    print("Invalid Input")
            case 2: 
                phone_settings = """
                1. Language
                2. Call Info Display
                3. Welcome Note
                4. Network Note
                5. Light
                6. Confirm SIM Service Actions
                Enter 0 to go back
                """
                print (phone_settings)
                phone_settings_option = int(input("Enter Phone Settings Option: "))
                if phone_settings_option == 0:
                    print(settings)
                else:
                    print("Invalid Input") 
            
            case 3:
                security_settings = """
                1. PIN Code Settings
                2. Call Code Request
                3. Fixed Dailing
                4. Closed User Group
                5. Phone Security
                6. Change Access Codes
                Enter 0 to go back
                """
                print(security_settings)
                security_settings_option = int(input("Enter Security Settings Option: "))
                if security_settings_option == 0:
                    print(settings)
                else:
                    print("Invalid Input")
            
            case 4:
                print("Restore factory Settings")
            case _:
                print("Invalid Input")        
          
    case 7:
        call_divert = """
        1. Call Divert
        Enter 0 to go back
        """
        print(call_divert)
        call_divert_option = int(input("Enter Call Divert Option: "))
        if call_divert == 0:
            print(nokia_menu)
        else:
            print("Invalid Input")
    
    case 8: 
        games = """
        1. Games
        Enter 0 to go back
        """
        print(games)
        games_menu_option = int(input("Enter Games Option: "))
        if games_menu_option == 0:
            print(nokia_menu)
        else:
            print("Invalid Input")
    
    
    case 9: 
        calculator = """
        1. calculator
        Enter 0 to go back
        """
        print(calculator)
        calculator_option = int(input("Enter Calculator Option: "))
        if calculator_option == 0:
            print(nokia_menu)
        else:
            print("Invalid Input")        
    
    
    
    case 10: 
        remainder = """
        1. Remainder
        Enter 0 to go back
        """
        print(remainder)
        remainder_option = int(input("Enter Remainder Option: "))
        if remainder_option == 0:
            print(nokia_menu)
        else:
            print("Invalid Input")        
    
    
    case 11:
        clock = """
        1. Alarm Clock
        2. Clock Settings
        3. Date Setting
        4. Stop Watch
        5. Countdown Timer
        6. Auto Update of Date and Time
        Enter 0 to go back
        """
        print(clock)
        clock_input = int(input("Enter Clock Option: "))
        if clock_input == 0:
            print(nokia_menu)
        else:
            print("Invalid Input")         
            
    
    case 12: 
        profiles = """
        1. Profiles
        Enter 0 to go back
        """
        print(profiles)
        profiles_option = int(input("Enter Profiles Option: "))
        if profiles_option == 0:
            print(nokia_menu)
        else:
            print("Invalid Input")    
    
    
    case 13: 
        sim_services = """
        1. SIM Services
        Enter 0 to go back
        """
        print(sim_services)
        sim_option = int(input("Enter SIM Option: "))
        if sim_option == 0:
            print(nokia_menu)
        else:
            print("Invalid Input")        
                
    
    case _:
        print("POWER OFF!!!")                
            
                   
