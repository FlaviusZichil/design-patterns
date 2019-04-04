# design-patterns
Producator de telefoane mobile

Aplicatia va fi formata din 3 entitati care vor comunica intre ele:
1.	PRODUCATORUL
-	Se ocupa de crearea telefoanelor (Factory sau Builder)
-	Costumizeaza telefoanele (Decorator)
-	Tine evidenta stocului

2.	ANGAJAT AL PRODUCATORULUI
-	Interactioneaza cu clientii
-	Primeste solicitari de la client (Chain of responsability) si le trimite producatorului (clientul trimite o cerere care va avea un tip (intrebare, garantie/reparare sau cumparare) si pentru fiecare tip exista un departament cu angajatii lui; initial, toate cererile vor ajunge la departamentul intrebari. Daca tipul cererii e intrebare o proceseaza, daca nu o trimite la alt departament. Astfel, fiecare angajat va avea 2 metode: handleRequest() si sendRequestForward())
-	Apartine unui departament
-	Pentru fiecare telefon vandut se va pastra o copie a obiectului intr-un raport de vanzari. (Prototype)

3.	CLIENTUL
-	Comanda telefoane (Facade?)
-	Trimit solicitari angajatilor 
-	Pot cauta telefoane dupa anumite criterii (Filter)

Pentru iterearea telefoanelor se va folosi sablonul Iterator.

Creational: Factory si Prototype
Structural: Decorator si Filter
Behavioral: Chain of Responsibility si Iterator

Aplciatia va fi implementata in Java.
	
