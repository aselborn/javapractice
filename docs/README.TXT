Ok, detta är alltså saker som kan vara bra att veta vad gäller java expertis.

1) STRING är immutable, dvs kan inte ändras när den väl är skapad. Däremot kan man ändra själva referensen till strängobjektet man skapat.
En immutable klass är deklarerad som FINAL för att inte kunna ändras på när man ärver.

    String namn = "Anders" //Här kan en instans från 'string constant pool' återanvändas

    String namn = new String("ANDERS") här skapas explicit ett nytt objekt.

 Strängar är objekt i Java , så man behöver inte alls använda 'new' operatorn.


 2) Generics, att kunna skriva en enda metod som kan användas inom flera olika typer, t ex strängar och tal