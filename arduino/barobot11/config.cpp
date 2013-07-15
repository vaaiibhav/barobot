// czy Android jest na koncu BT (Serial3)
#define USE_BT true

// czy debugowac przez BT
#define DEBUG_OVER_BT false

// czy debugowac przez Serial0
#define DEBUG_OVER_SERIAL true

#define DEBUG_ADB2ANDROID false

// czy Android jest na koncu USB
#define USE_ADB false
#define ADB_PORT 14568

#define DEBUG_SERIAL_INPUT false
#define DEBUG_BT_INPUT true
#define DEBUG_ADB_INPUT true
#define DEBUG_OUTPUT2ANDROID true

// obsluga zrodel wejscia
#define SERIAL0_BOUND 115200
#define BT_BOUND 9600
#define BT_DEV_NAME "barobot1.0"
//#define SERIAL0_BOUND 9600

// ycz usyzwac sterownika 2 czy 4 pinowego
#define SERVOX4PIN true
#define SERVOY4PIN true

// Brakujace opisy dla pinów
const int PIN8 = 8;
const int PIN9 = 9;
const int PIN10 = 10;
const int PIN11 = 11;
const int PIN12 = 12;
const int PIN13 = 13;
const int PIN14 = 14;
const int PIN15 = 15;
const int PIN16 = 16;
const int PIN17 = 17;
const int PIN18 = 18;
const int PIN19 = 19;
const int PIN20 = 20;
const int PIN21 = 21;
const int PIN22 = 22;
const int PIN23 = 23;
const int PIN24 = 24;
const int PIN25 = 25;
const int PIN26 = 26;
const int PIN27 = 27;
const int PIN28 = 28;
const int PIN29 = 29;
const int PIN30 = 30;
const int PIN31 = 31;
const int PIN32 = 32;
const int PIN33 = 33;
const int PIN34 = 34;
const int PIN35 = 35;
const int PIN36 = 36;
const int PIN37 = 37;
const int PIN38 = 38;
const int PIN39 = 39;
const int PIN40 = 40;
const int PIN41 = 41;
const int PIN42 = 42;
const int PIN43 = 43;
const int PIN44 = 44;
const int PIN45 = 45;
const int PIN46 = 46;
const int PIN47 = 47;
const int PIN48 = 48;
const int PIN49 = 49;

// INDEX pinów zeby sie nie pomylić
// 0  TX0
// 1  RX0
// 2  PWM     IN     INT0    // WOLNY INT
// 3  PWM     IN     INT1    // IRRZ_PIN Krańcowy Z
// 4  PWM     OUT    STEPPER_Z_PWM
// 5  PWM     OUT    STATUS_LED03 - LED od tacki
// 6  PWM     OUT    STATUS_LED04
// 7  PWM     OUT    STATUS_LED05
// 8  PWM     OUT    STATUS_LED06
// 9  PWM     OUT    STATUS_LED07
// 10  PWM    OUT    STATUS_LED08
// 11  PWM    OUT    STATUS_LED09
// 12  PWM    OUT    STATUS_LED_PIN
// 13  PWM    OUT    STATUS_LED01
// 14  TX3    I/O    BT
// 15  RX3    I/O    BT
// 16  TX2 
// 17  RX2
// 18  TX1        INT5    // Enkoder Y
// 19  RX1        INT4    // Enkoder X
// 20  i2c?       INT3    IRRX_PIN // Krańcowy X
// 21  i2c?       INT2    IRRY_PIN // Krańcowy Y
// 22              ultrasonic 0 ECHOPIN 
// 23         OUT  STATUS_LED02
// 24              ultrasonic 0 TRIGPIN
// 25  
// 26             ultrasonic 1 ECHOPIN  
// 27  
// 28            ultrasonic 1 TRIGPIN  
// 29  
// 30  
// 30  PIN_MADDR0  (multiplexer)
// 31  
// 32  PIN_MADDR1  (multiplexer)
// 33  
// 34  PIN_MADDR2  (multiplexer)
// 35  
// 36  PIN_MADDR3  (multiplexer)
// 37  
// 38  
// 39  
// 30          OUT STEPPER_Z_ENABLE
// 31   
// 32  
// 33  
// 34  
// 35  
// 36  
// 37  
// 38  
// 39  
// 40  lk        stepper Y Step // STEPPER_Y_STEP0 
// 41          stepper Y DIR  // STEPPER_Y_STEP1 
// 42                         // STEPPER_Y_STEP2 
// 43                         // STEPPER_Y_STEP3 
// 44
// 45
// 46          stepper X Step / STEPPER_X_STEP0 
// 47          stepper X DIR  / STEPPER_X_STEP1
// 48          stepper X      / STEPPER_X_STEP2
// 49          stepper X      / STEPPER_X_STEP3


//ANALOGS:
// A0    // potencjomentr
// A1
// A2    // miernik wagi podlaczony do multipleksera
// A3    
// A4  
// A5  
// A6  
// A7  
// A8  
// A9  
// A10  
// A11  
// A12  
// A13  
// A14  
// A15  

// PINY dla wag
#define PIN_WAGA_ANALOG A2
//#define PIN_WAGA_BUTTLES_ANALOG A3

#define IRRX_PIN 20
#define IRRY_PIN 21
#define IRRZ_PIN 3

// PINY dla ultradzwięków
#define PIN_ULTRA0_TRIG PIN24
#define PIN_ULTRA0_ECHO PIN22
#define PIN_ULTRA1_TRIG PIN28
#define PIN_ULTRA1_ECHO PIN26
#define MAX_DISTANCE 200
// powtarzaj 5 razy odczyt
#define DIST_REPEAT 5


// mozliwe stany uC (mikrokontrolera)
#define STATE_INIT 2
#define STATE_READY 4
#define STATE_BUSY 8
#define STATE_ERROR 32

// koniec stanu uC

// kody osi
#define NO_AXIS 0
#define AXIS_X 2
#define AXIS_Y 4
#define AXIS_Z 8
// koniec kody osi

// PINY dla stepperow
#define STEPPER_X_STEP PIN46
#define STEPPER_X_DIR PIN47
#define STEPPER_X_STEP0 PIN46
#define STEPPER_X_STEP1 PIN47
#define STEPPER_X_STEP2 PIN48
#define STEPPER_X_STEP3 PIN49

#define STEPPER_Y_STEP PIN40
#define STEPPER_Y_DIR PIN41
#define STEPPER_Y_STEP0 PIN40
#define STEPPER_Y_STEP1 PIN41
#define STEPPER_Y_STEP2 PIN42
#define STEPPER_Y_STEP3 PIN43

//#define STEPPER_Z_ENABLE PIN30
#define STEPPER_Z_PWM PIN4

// Mnoznik pozycji progamowej na sprzetowa
#define STEPPER_X_MUL  1
#define STEPPER_Y_MUL  1

// PIN dla diody statusu
#define STATUS_LED_PIN 12

// PINy dla wyjść podświetlenia
#define STATUS_LED01 PIN13
#define STATUS_LED02 PIN23
#define STATUS_LED03 PIN5
#define STATUS_LED04 PIN6
#define STATUS_LED05 PIN7
#define STATUS_LED06 PIN8
#define STATUS_LED07 PIN9
#define STATUS_LED08 PIN10
#define STATUS_LED09 PIN11

// PINy dla adresu multipleksera
#define PIN_MADDR0 PIN30
#define PIN_MADDR1 PIN32
#define PIN_MADDR2 PIN34
#define PIN_MADDR3 PIN36

#define MULTI_ADDR_TIME 10
#define MULTI_READ_TIME 10
#define MULTI_READ_COUNT 8
#define WAGA_READ_COUNT 2


// domyslen ustawienie mocy silnika Z
#define SERVOZ_UP 900
#define SERVOZ_STAYUP 900
#define SERVOZ_DOWN 3000
//#define SERVOZ_UP 2290
//#define SERVOZ_STAYUP 1530
//#define SERVOZ_DOWN 1400

// domyslnie ustawienie mocy silnikow Xy
#if SERVOX4PIN==true
  #define SPEEDX 500
  #define ACCELERX 1350
  #define XLENGTH 1700
#else
  #define SPEEDX 2000
  #define ACCELERX 2000
  #define XLENGTH 1900
#endif

#define SPEEDY 800
#define ACCELERY 600

// kierunki dla serva Z
#define DIR_UP 1
#define DIR_DOWN 2
#define DIR_STOP 0

// 1 znak rozdielający komendy
#define SEPARATOR_CHAR '\n'

//  ile losowych losowac
#define LOS_MAX 20


