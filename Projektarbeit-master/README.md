# Projektarbeit

### Einleitung
Anstelle einer klassischen Klausur, haben wir im  Rahmen der Projektarbeit, ein kleines Programm zur Verwaltung von Arbeitern und Bauaufträgen erstellt.
Dazu haben wir die Software "NetBeans", aufgrund seines komfortablen GUI Builders genutzt. 

### Probleme die bei der erstellung des Projekts aufgetreten sind
Zum einen hatte unsere Gruppe das Problem, dass wir in zwei unterschiedlichen Compilern, unsere GUI gebaut haben, ohne zu wissen,
dass man die GUI die man in der einen Software, nicht in der anderen Software bearbeiten können.

Außerdem war das so, dass der Compiler "NetBeans", mit dem wir unsere erste GUI erstellt haben, automatisch Zeilen
generiert hat, die man nicht bearbeiten darf. Diese kann man zwar in NetBeans nicht löschen... in InteliJ aber schon, was dazu geführt hat,
dass man die GUI auch nicht mehr in Netbeans bearbeiten konnte. Somit waren wir dann eingeschränkt was das erstellen und bearbeiten von tabllen geht.

Als notlösung, haben wir den Button "zugewiesene Arbeiter" in neue GUI in InteliJ erstellt, wo wir dann die restlichen Funktionen die uns fehlten (import/export). Dort hineingepackt
haben.

---

### Funktionen für die Arbeiter

#### Arbeiter erstellen
Um alle Funktionen des Programms wirklich nutzen zu können, brauchen wir erstmal Mitarbeiter. Diesen erstellen wir ganz leicht über den Button "Arbeiter erstellen".

Nun erscheinen verschiedene Fenster der Reihe nach auf, wo wir die Informationen der Arbeiter eintragen können.

Beim Datum allerdings, sollte man darauf achten, dass man diesen in der Reihen folge dd-MM-yyyy angibt, da ansonsten eine Fehlmeldung erscheint, und die Eingabe von vorne erfolgen muss.


#### Arbeiter verändern
Was ist denn, wenn der Nutzer, die Eingabe der Arbeiter falsch getätigt hat? Besteht dieser Fall, können die Informationen über den Button "Arbeiter ändern" verändert werden.

Dazu klickt man die Zelle an die verändert werden soll und klickt auf den Button. Nun erscheint ein Fenster, wo die neue Information eingetragen werden kann.

#### Arbeiter Löschen
Wird ein Arbeiter gekündigt, kann er auch selbstverschtändlich aus der Datenbank entfernt werden.

---

### Funktionen für die Bauaufträge

#### Bauaufträge erstellen/löschen/bearbeiten
Das erstellen, löschen und bearbeiten von Bauaufträgen funktioniert vom Prinzip her analog zu den Arbeitern

#### einen Arbeiter zuweisen
Also, wir haben jetzt zwar unsere Arbeiter und Bauaufträge. Jetzt können die Arbeiter ja nicht einfach so däumchen drehen... also Weisen wir denen mal ihre Jobs zu.

Dazu klicken Sie den Arbeiter an den Sie zu einem Auftrag zuweisen möchten, und wählen dann den Bauauftrag aus, zu dem der ausgewählte Arbeiter hinzugefügt werden soll. Anschließend klicken Sie auf den Button "Arbeit Geben". Somit wurde dem Auftrag dann ein Arbeiter hinzugefügt.

#### einen Arbeiter entfernen
Wenn wir jetzt einen Arbeiter von einer Arbeit zurückziehen möchten, gehen wir eigentlich Analog wie bei der zuweisung vor. Wir wählen einen Bauauftrag und einen Arbeiter aus und betätigen den button "Arbeit entziehen".
Nun wäre der Arbeiter erfolgreich vom Job entzogen.

---

### Der Button der übrig ist
Wir haben jetzt noch einen Button über, den von dem Sie noch nicht wissen was er bewirkt. Wenn sie diesen Knopf drücken,
erscheint ein neues Fenster, worin Sie weitere Extras finden.

#### Zugewiesene Arbeiter einsehen
Sicherlich möchten Sie auch wissen, welche Arbeiter an einem bestimmten Auftrag zugeteilt worden ist. Dazu klicken Sie den gewünschten Bauauftrag an und betätigen dann den Knopf "zugewiesene Arbetiter einsehen".
Nun erscheint ein weiteres Fenster, worin Sie alle zum ausgewählten Auftrag zugewiesene Arbeiter einsehen.

#### Export Bauaufträgeliste/Arbeiterliste
Mit diesem Button, können wir unsere Mitarbeiterliste und Bauauftragliste exportieren. Man sollte nur darauf achten, dass die Listen
inhalt besitzen, weil sonst eine Fehlermeldung erscheint.

---

