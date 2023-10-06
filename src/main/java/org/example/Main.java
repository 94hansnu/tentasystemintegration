package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        Scanner scanner = new Scanner(System.in);
        int score =0;
        int totalQuestions=0;

        System.out.println("Välkommen till FTP och SFTP Quiz!");
        System.out.println("Besvara följande frågor genom att ange bokstaven (a, b eller c) för ditt svar.");

        // Fråga 1
        totalQuestions++;
        System.out.println("\nFråga 1: Vad är huvudsakligen syftet med FTP inom integrationsplattformar?");
        System.out.println("a) För att spela musik");
        System.out.println("b) För att överföra filer mellan olika system och platser");
        System.out.println("c) För att skapa webbplatser");
        String answer1 = scanner.nextLine();
        if (answer1.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) För att överföra filer mellan olika system och platser.'");
        }
        // Fråga 2
        totalQuestions++;
        System.out.println("\nFråga 2: Hur kan FTP användas inom integrationsplattformar för att hantera filer?");
        System.out.println("a) Genom att ladda upp och hämta filer på en fjärrserver");
        System.out.println("b) Genom att skapa krypterade filer");
        System.out.println("c) Genom att komprimera filer");
        String answer2 = scanner.nextLine();
        if (answer2.equals("a")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'a) '");
        }

        // Fråga 3
        totalQuestions++;
        System.out.println("\nFråga 3: Vilket är det främsta syftet med SFTP (Secure File Transfer Protocol) inom integrationsplattformar?");
        System.out.println("a) Att spela musik säkert");
        System.out.println("b) Att överföra filer på ett säkert sätt genom krypterad kommunikation");
        System.out.println("c) Att överföra filer utan lösenord");
        String answer3 = scanner.nextLine();
        if (answer3.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Fråga 4
        totalQuestions++;
        System.out.println("\nFråga 4: Vad är autentisering och auktorisering i samband med SFTP?");
        System.out.println("a) Att verifiera användarens identitet och bestämma behörigheter för åtkomsten");
        System.out.println("b) Att skapa nya användare");
        System.out.println("c) Att överföra filer via krypterad kommunikation");
        String answer4 = scanner.nextLine();
        if (answer4.equals("a")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'a) '");
        }

        // Fråga 5
        totalQuestions++;
        System.out.println("\nFråga 5: Vilka fördelar erbjuder SFTP i termer av säkerhet och övervakning?");
        System.out.println("a) SFTP ger inga säkerhetsfördelar");
        System.out.println("b) SFTP erbjuder integritetskontroll och loggning av filöverföringar");
        System.out.println("c) SFTP möjliggör obehörig åtkomst till filer");
        String answer5 = scanner.nextLine();
        if (answer5.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Fråga 6
        totalQuestions++;
        System.out.println("\nFråga 6: Vad innebär fjärråtkomst till filsystem i samband med SFTP?");
        System.out.println("a) Att användaren kan ansluta till en webbplats på distans");
        System.out.println("b) Att användaren kan fjärransluta till filsystemet på en server och utföra fil-relaterade operationer på ett säkert sätt");
        System.out.println("c) Att användaren kan skicka filer via e-post");
        String answer6 = scanner.nextLine();
        if (answer6.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Fråga 7
        totalQuestions++;
        System.out.println("\nFråga 7: Vilken typ av kommunikation använder SFTP för att skydda filinnehållet?");
        System.out.println("a) Oskyddad kommunikation");
        System.out.println("b) Krypterad kommunikation");
        System.out.println("c) Kommunikation via Bluetooth");
        String answer7 = scanner.nextLine();
        if (answer7.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Fråga 8
        totalQuestions++;
        System.out.println("\nFråga 8: Vad är en typisk användning av FTP inom integrationsplattformar?");
        System.out.println("a) Att skapa en webbplats");
        System.out.println("b) Att automatisera processen för att flytta och hantera filer mellan olika platser");
        System.out.println("c) Att spela musik på en server");
        String answer8 = scanner.nextLine();
        if (answer8.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Fråga 9
        totalQuestions++;
        System.out.println("\nFråga 9: Vad är huvudskillnaden mellan TCP och UDP när det gäller filöverföring?");
        System.out.println("a) TCP är snabbare än UDP.");
        System.out.println("b) TCP är tillförlitlig och ordnad, medan UDP är enkelt och snabbt.");
        System.out.println("c) Både TCP och UDP använder ack/nack-metoder för att överföra filer.");
        String answer9 = scanner.nextLine();
        if (answer9.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Fråga 10
        totalQuestions++;
        System.out.println("\nFråga 10: Vilken typ av kommunikation använder TCP för filöverföring?");
        System.out.println("a) Förbindelselös kommunikation");
        System.out.println("b) Förbindelseorienterad kommunikation");
        System.out.println("c) Kommunikation utan krav på uppkoppling");
        String answer10 = scanner.nextLine();
        if (answer10.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Fråga 11
        totalQuestions++;
        System.out.println("\nFråga 11: Vilka metoder använder TCP för att säkerställa tillförlitlig filöverföring?");
        System.out.println("a) Flödeskontroll och kongestionshantering");
        System.out.println("b) Handskakning och pålitlig dataöverföring med ACK och NACK");
        System.out.println("c) Använder inte några metoder för att säkerställa tillförlitlig filöverföring");
        String answer11 = scanner.nextLine();
        if (answer11.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Fråga 12
        totalQuestions++;
        System.out.println("\nFråga 12: Vad är kongestionshanteringens syfte inom TCP?");
        System.out.println("a) Att öka nätverkets hastighet");
        System.out.println("b) Att undvika överbelastning i nätverket");
        System.out.println("c) Att skapa fler förbindelser");
        String answer12 = scanner.nextLine();
        if (answer12.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Fråga 13
        totalQuestions++;
        System.out.println("\nFråga 13: Vilken typ av kommunikation använder UDP för filöverföring?");
        System.out.println("a) Förbindelseorienterad kommunikation");
        System.out.println("b) Förbindelselös kommunikation");
        System.out.println("c) Asynkron kommunikation");
        String answer13 = scanner.nextLine();
        if (answer13.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Fråga 14
        totalQuestions++;
        System.out.println("\nFråga 14: Vad är en av de främsta nackdelarna med UDP för filöverföring?");
        System.out.println("a) Det är osäkert och osorterat");
        System.out.println("b) Det är långsammare än TCP");
        System.out.println("c) Det har kongestionshantering");
        String answer14 = scanner.nextLine();
        if (answer14.equals("a")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'a'");
        }

        // Fråga 15
        totalQuestions++;
        System.out.println("\nFråga 15: Vad innebär ordnad dataöverföring i samband med TCP?");
        System.out.println("a) Att dataöverföringen är slumpmässig");
        System.out.println("b) Att dataöverföringen är förlorad");
        System.out.println("c) Att dataöverföringen sker i samma ordning som den skickades");
        String answer15 = scanner.nextLine();
        if (answer15.equals("c")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'c'");
        }

        // Fråga 16
        totalQuestions++;
        System.out.println("\nFråga 16: Varför kan UDP leda till överbelastning i nätverket vid hög trafik?");
        System.out.println("a) Eftersom UDP är snabbare än TCP");
        System.out.println("b) Eftersom UDP inte har kongestionshantering");
        System.out.println("c) Eftersom UDP använder ack/nack-metoder");
        String answer16 = scanner.nextLine();
        if (answer16.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Fråga 17
        totalQuestions++;
        System.out.println("\nFråga 17: Vad är några viktiga faktorer att överväga när du väljer en iPaaS-plattform?");
        System.out.println("a) Skalbarhet och användning av dray and drop-gränssnitt");
        System.out.println("b) Integrationsflöden och dataöverföring");
        System.out.println("c) Pris, support och framtida utveckling");
        String answer17 = scanner.nextLine();
        if (answer17.equals("c")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'c'");
        }
        // Fråga 18
        totalQuestions++;
        System.out.println("\nFråga 18: Vilken plattform erbjuder möjligheten att ansluta olika system, appar och datakällor med hjälp av API:er och integrationsflöden?");
        System.out.println("a) Mulesoft Anypoint Platform");
        System.out.println("b) Dell Boomi");
        System.out.println("c) Apache Kafka");
        String answer18 = scanner.nextLine();
        if (answer18.equals("a")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'a'");
        }

        // Fråga 19
        totalQuestions++;
        System.out.println("\nFråga 19: Vilken integrationsplattform är molnbaserad och stöder både moln- och lokalbaserade integrationer?");
        System.out.println("a) Apache Kafka");
        System.out.println("b) Dell Boomi");
        System.out.println("c) Mulesoft Anypoint Platform");
        String answer19 = scanner.nextLine();
        if (answer19.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Fråga 20
        totalQuestions++;
        System.out.println("\nFråga 20: Vilken plattform används för att bygga realtidsdataströmmar och eventbaserade system med hög genomströmning och skalbarhet?");
        System.out.println("a) Microsoft Azure Logic APPS");
        System.out.println("b) Apache Kafka");
        System.out.println("c) IBM Integration Bus");
        String answer20 = scanner.nextLine();
        if (answer20.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }
        // Fråga 21
        totalQuestions++;
        System.out.println("\nFråga 21: Vilken iPaaS-plattform erbjuder möjligheten att skapa automatiserade arbetsflöden och integrationsflöden med hjälp av ett visuellt gränssnitt?");
        System.out.println("a) IBM Integration Bus");
        System.out.println("b) Zapier");
        System.out.println("c) Jitterbit");
        String answer21 = scanner.nextLine();
        if (answer21.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b.'");
        }

        // Fråga 22
        totalQuestions++;
        System.out.println("\nFråga 22: Vilket verktyg används för att skapa automatiserade arbetsflöden och koppla samman olika webbapplikationer och tjänster utan att kräva kodkunskap?");
        System.out.println("a) Mulesoft Anypoint Platform");
        System.out.println("b) Microsoft Azure Logic APPS");
        System.out.println("c) Zapier");
        String answer22 = scanner.nextLine();
        if (answer22.equals("c")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'c'");
        }

        // Fråga 23
        totalQuestions++;
        System.out.println("\nFråga 23: Vilken integrationsplattform används för att koppla samman olika applikationer och system genom att skapa flöden och rutiner för dataöverföring och transformationslogik?");
        System.out.println("a) IBM Integration Bus");
        System.out.println("b) Jitterbit");
        System.out.println("c) Dell Boomi");
        String answer23 = scanner.nextLine();
        if (answer23.equals("c")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'c'");
        }

        // Fråga 24
        totalQuestions++;
        System.out.println("\nFråga 24: Vilken plattform innehåller verktyg för API-design, hantering och övervakning?");
        System.out.println("a) Zapier");
        System.out.println("b) Mulesoft Anypoint Platform");
        System.out.println("c) Microsoft Azure Logic APPS");
        String answer24 = scanner.nextLine();
        if (answer24.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }
// Fråga 25
        totalQuestions++;
        System.out.println("\nFråga 25: Vad är Zapier?");
        System.out.println("a) En integrationsplattform för att ansluta olika system, appar och datakällor.");
        System.out.println("b) En molnbaserad plattform med stöd för både moln- och lokalbaserade integrationer.");
        System.out.println("c) Ett verktyg för att skapa automatiserade arbetsflöden och koppla samman webbapplikationer utan kodkunskap.");
        String answer25 = scanner.nextLine();
        if (answer25.equals("c")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'c'");
        }

        // Fråga 26
        totalQuestions++;
        System.out.println("\nFråga 26: Vad erbjuder Mulesoft Anypoint Platform?");
        System.out.println("a) Skalbarhet och användning av dray and drop-gränssnitt.");
        System.out.println("b) Möjligheten att bygga realtidsdataströmmar och eventbaserade system.");
        System.out.println("c) Verktyg för API-design, hantering och övervakning.");
        String answer26 = scanner.nextLine();
        if (answer26.equals("c")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'c'");
        }

        // Fråga 27
        totalQuestions++;
        System.out.println("\nFråga 27: Vilken plattform används för att skapa integrationsflöden med dray and drop-gränssnitt?");
        System.out.println("a) Dell Boomi");
        System.out.println("b) Mulesoft Anypoint Platform");
        System.out.println("c) Microsoft Azure Logic APPS");
        String answer27 = scanner.nextLine();
        if (answer27.equals("a")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'a'");
        }

        // Fråga 28
        totalQuestions++;
        System.out.println("\nFråga 28: Vad är huvudsakliga egenskapen hos Apache Kafka?");
        System.out.println("a) Fjärråtkomst till filsystemet på en server.");
        System.out.println("b) Möjligheten att bygga realtidsdataströmmar med hög genomströmning.");
        System.out.println("c) Integrationsflöden och dataöverföring.");
        String answer28 = scanner.nextLine();
        if (answer28.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Fråga 29
        totalQuestions++;
        System.out.println("\nFråga 29: Vilken integrationsplattform erbjuder en visuell gränssnitt för att skapa automatiserade arbetsflöden och integrationsflöden?");
        System.out.println("a) IBM Integration Bus");
        System.out.println("b) Zapier");
        System.out.println("c) Jitterbit");
        String answer29 = scanner.nextLine();
        if (answer29.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Fråga 30
        totalQuestions++;
        System.out.println("\nFråga 30: Vad är huvudsakliga användningen av Dell Boomi?");
        System.out.println("a) Att skapa automatiserade arbetsflöden och integrationsflöden.");
        System.out.println("b) Att ansluta olika system, appar och datakällor genom API:er och integrationsflöden.");
        System.out.println("c) Att skapa realtidsdataströmmar och eventbaserade system.");
        String answer30 = scanner.nextLine();
        if (answer30.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Fråga 31
        totalQuestions++;
        System.out.println("\nFråga 31: Vad erbjuder Microsoft Azure Logic APPS?");
        System.out.println("a) Möjligheten att skapa automatiserade arbetsflöden och integrationsflöden med visuellt gränssnitt.");
        System.out.println("b) Skalbarhet och användning av dray and drop-gränssnitt.");
        System.out.println("c) Möjligheten att koppla samman olika applikationer och system genom flöden och rutiner för dataöverföring.");
        String answer31 = scanner.nextLine();
        if (answer31.equals("a")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'a'");
        }

        // Fråga 32
        totalQuestions++;
        System.out.println("\nFråga 32: Vad är Jitterbit?");
        System.out.println("a) En integrationsplattform för att ansluta system, appar och datakällor.");
        System.out.println("b) Ett verktyg för att skapa automatiserade arbetsflöden och koppla samman olika webbapplikationer.");
        System.out.println("c) En molnbaserad plattform med stöd för både moln- och lokalbaserade integrationer.");
        String answer32 = scanner.nextLine();
        if (answer32.equals("a")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'a'");
        }

        // Fråga 33
        totalQuestions++;
        System.out.println("\nFråga 33: Vad är Apache Kafka?");
        System.out.println("a) En webbläsare");
        System.out.println("b) Ett distribuerat system för meddelandehantering");
        System.out.println("c) En databas");
        String answer33 = scanner.nextLine();
        if (answer33.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }
        // Fråga 34
        totalQuestions++;
        System.out.println("\nFråga 34: Vad består ett Kafka-kluster av?");
        System.out.println("a) En enskild mäklare");
        System.out.println("b) Minst tre mäklare");
        System.out.println("c) En enda klient");
        String answer34 = scanner.nextLine();
        if (answer34.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Fråga 35
        totalQuestions++;
        System.out.println("\nFråga 35: Vad är huvuduppgiften för varje mäklare i ett Kafka-kluster?");
        System.out.println("a) Att lagra data");
        System.out.println("b) Att skicka meddelanden och hantera kommunikation mellan lagring och klienter");
        System.out.println("c) Att organisera Zookeeper-tjänsten");
        String answer35 = scanner.nextLine();
        if (answer35.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Fråga 36
        totalQuestions++;
        System.out.println("\nFråga 36: Hur går meddelandeflödet inom ett Kafka-kluster?");
        System.out.println("a) Från klient till datalagring");
        System.out.println("b) Från datalagring till klient");
        System.out.println("c) Från producent via mäklare till konsument");
        String answer36 = scanner.nextLine();
        if (answer36.equals("c")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'c'");
        }

        // Fråga 37
        totalQuestions++;
        System.out.println("\nFråga 37: Hur organiseras och identifieras alla mäklare i en Kafka-kluster?");
        System.out.println("a) Genom en central server");
        System.out.println("b) Genom Apache Kafka själv");
        System.out.println("c) Genom Zookeeper-tjänsten");
        String answer37 = scanner.nextLine();
        if (answer37.equals("c")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'c'");
        }

        // Fråga 38
        totalQuestions++;
        System.out.println("\nFråga 38: Vad är en producent (producer) av data inom Apache Kafka?");
        System.out.println("a) En tjänst som konsumerar data från klienter.");
        System.out.println("b) En tjänst som producerar eller lagrar data, såsom databaser, API:er eller livetjänster.");
        System.out.println("c) En central server som lagrar all data inom ett Kafka-kluster.");
        String answer38 = scanner.nextLine();
        if (answer38.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Fråga 39
        totalQuestions++;
        System.out.println("\nFråga 39: Hur fungerar datalagring i samband med Kafka-producenter?");
        System.out.println("a) Datan skickas till en specifik klient kopplad till Kafka-servern.");
        System.out.println("b) Datan sparas i servern och är läsbar för alla klienter med behörighet till datan.");
        System.out.println("c) Datan skickas till en enda Kafka-producent för lagring.");
        String answer39 = scanner.nextLine();
        if (answer39.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Klient (Consumer av data):
        // Fråga 40
        totalQuestions++;
        System.out.println("\nFråga 40: Vad är huvuduppgiften för en klient (consumer) av data inom Kafka?");
        System.out.println("a) Att skapa och producera data.");
        System.out.println("b) Att läsa och konsumera data som har skickats till Kafka-servern.");
        System.out.println("c) Att organisera och hantera Kafka-topics.");
        String answer40 = scanner.nextLine();
        if (answer40.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Fråga 41
        totalQuestions++;
        System.out.println("\nFråga 41: Vilken typ av behörighet behöver en klient för att kunna läsa specifik data från en producent?");
        System.out.println("a) Tillstånd för all data inom Kafka-servern.");
        System.out.println("b) Tillstånd för den specifika data som har hämtats från producenten.");
        System.out.println("c) Inga specifika behörigheter krävs.");
        String answer41 = scanner.nextLine();
        if (answer41.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Kafka Topic:
        // Fråga 42
        totalQuestions++;
        System.out.println("\nFråga 42: Varför behöver Kafka-servern topics?");
        System.out.println("a) För att spara datafiler på disken.");
        System.out.println("b) För att identifiera data och veta vilken data som kommer från vilken källa.");
        System.out.println("c) För att organisera Kafka-mäklarna.");
        String answer42 = scanner.nextLine();
        if (answer42.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Fråga 43
        totalQuestions++;
        System.out.println("\nFråga 43: Vad representerar en Kafka-topic, och hur kan den jämföras med andra strukturer?");
        System.out.println("a) En Kafka-topic är en databas för att lagra data.");
        System.out.println("b) En Kafka-topic kan ses som en tabell eller mapp i en filstruktur.");
        System.out.println("c) En Kafka-topic är en separat instans av Kafka-servern.");
        String answer43 = scanner.nextLine();
        if (answer43.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Kafka Partition:
        // Fråga 44
        totalQuestions++;
        System.out.println("\nFråga 44: Varför delar Kafka upp varje topic i flera partitioner?");
        System.out.println("a) För att spara utrymme på disken.");
        System.out.println("b) För att hantera stora datamängder och kunna välja specifik data.");
        System.out.println("c) För att separera producenter från konsumenter.");
        String answer44 = scanner.nextLine();
        if (answer44.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Fråga 45
        totalQuestions++;
        System.out.println("\nFråga 45: Hur identifieras specifik data i en partition inom Kafka?");
        System.out.println("a) Med hjälp av unika namn för varje del av datan.");
        System.out.println("b) Genom att använda offset, som fungerar som en indexposition i partitionen.");
        System.out.println("c) Genom att använda ett timestamp för varje datastycke.");
        String answer45 = scanner.nextLine();
        if (answer45.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Fråga 46
        totalQuestions++;
        System.out.println("\nFråga 46: Vilka aspekter påverkas när du ändrar inställningar i Kafka-servern?");
        System.out.println("a) Endast nätverksprestanda");
        System.out.println("b) Minne, diskutrymme, partitionering och replikering");
        System.out.println("c) Bara datalagringens prestanda");
        String answer46 = scanner.nextLine();
        if (answer46.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Fråga 47
        totalQuestions++;
        System.out.println("\nFråga 47: Vad är en rekommenderad maxgräns för antalet partitioner per Kafka-topic?");
        System.out.println("a) Obegränsat antal partitioner");
        System.out.println("b) Maximalt 10 partitioner per topic");
        System.out.println("c) Minst 100 partitioner per topic");
        String answer47 = scanner.nextLine();
        if (answer47.equals("a")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'a'");
        }

        // Fråga 48
        totalQuestions++;
        System.out.println("\nFråga 48: Vad påverkar ökningen av replikafaktorn i Kafka?");
        System.out.println("a) Säkerheten");
        System.out.println("b) Prestandan");
        System.out.println("c) Både säkerheten och prestandan");
        String answer48 = scanner.nextLine();
        if (answer48.equals("c")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'c'");
        }

        // Fråga 49
        totalQuestions++;
        System.out.println("\nFråga 49: Vad är en unik konfigurationsinställning för varje broker i ett Kafka-kluster?");
        System.out.println("a) Broker-ID");
        System.out.println("b) Antal nätverkstrådar");
        System.out.println("c) Antal I/O-trådar");
        String answer49 = scanner.nextLine();
        if (answer49.equals("a")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'a'");
        }

        // Fråga 50
        totalQuestions++;
        System.out.println("\nFråga 50: Vad är syftet med inställningen \"log-dirs\" i Kafka-konfigurationsfilen?");
        System.out.println("a) Att ange sökvägen till loggdata");
        System.out.println("b) Att kontrollera antalet partitioner per topic");
        System.out.println("c) Att definiera broker-ID");
        String answer50 = scanner.nextLine();
        if (answer50.equals("a")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'a'");
        }

        // Fråga 51
        totalQuestions++;
        System.out.println("\nFråga 51: Vad innebär \"topicspartition\" i Kafka i samband med partitionering?");
        System.out.println("a) Det är en speciell typ av Kafka-topic som är exklusiv för partitionering.");
        System.out.println("b) Det är fördelningen av data över partitioner inom en Kafka-topic.");
        System.out.println("c) Det är en inställning som styr antalet partitioner för alla Kafka-topics.");
        String answer51 = scanner.nextLine();
        if (answer51.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Fråga 52
        totalQuestions++;
        System.out.println("\nFråga 52: Vad är syftet med att använda nycklar och partitionID i Kafka?");
        System.out.println("a) Att kontrollera datan på klientnivå");
        System.out.println("b) Att optimera Kafka-brokerns prestanda");
        System.out.println("c) Att styra datafördelningen över partitioner");
        String answer52 = scanner.nextLine();
        if (answer52.equals("c")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'c'");
        }

        // Fråga 53
        totalQuestions++;
        System.out.println("\nFråga 53: Vad representerar inställningen \"offsets.topic.replication.factor\" i Kafka-konfigurationen?");
        System.out.println("a) Antalet partitioner i en Kafka-topic");
        System.out.println("b) Kopior av data för att säkerställa hög tillgänglighet");
        System.out.println("c) Antalet I/O-trådar för diskåtkomst");
        String answer53 = scanner.nextLine();
        if (answer53.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Fråga 54
        totalQuestions++;
        System.out.println("\nFråga 54: Vad är betydelsen av \"transaction.state.log.replication.factor\" i Kafka-konfigurationen?");
        System.out.println("a) Antalet replikor för varje partition");
        System.out.println("b) Antalet partitioner i en Kafka-topic");
        System.out.println("c) Antalet trådar som används för nätverkskommunikation");
        String answer54 = scanner.nextLine();
        if (answer54.equals("a")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'a'");
        }

        // Fråga 55
        totalQuestions++;
        System.out.println("\nFråga 55: Vad står förkortningen \"ISR\" för i samband med Kafka-partitioner?");
        System.out.println("a) Intern statisk resurs");
        System.out.println("b) In-sync replicas");
        System.out.println("c) Intelligens och säkerhet i replikor");
        String answer55 = scanner.nextLine();
        if (answer55.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Fråga 56
        totalQuestions++;
        System.out.println("\nFråga 56: Vad är fördelen med att använda flera consumers som arbetar parallellt i en Consumer Group?");
        System.out.println("a) Att minska datalagrets prestanda");
        System.out.println("b) Att hantera stora datamängder effektivt");
        System.out.println("c) Att minska antalet partitioner i en Kafka-topic");
        String answer56 = scanner.nextLine();
        if (answer56.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Fråga 57
        totalQuestions++;
        System.out.println("\nFråga 57: Varför är det viktigt att varje consumer i gruppen tar ansvar för en specifik partition?");
        System.out.println("a) För att öka datalagrets kapacitet");
        System.out.println("b) För att säkerställa att samma meddelande inte hanteras flera gånger");
        System.out.println("c) För att göra arbetsbelastningen ojämn");
        String answer57 = scanner.nextLine();
        if (answer57.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Fråga 58
        totalQuestions++;
        System.out.println("\nFråga 58: Vilket syfte tjänar skalbarhet och hög tillgänglighet inom Kafka Consumer Groups?");
        System.out.println("a) Att minska partitioneringen");
        System.out.println("b) Att öka arbetsbelastningen");
        System.out.println("c) Att hantera stora datamängder effektivt");
        String answer58 = scanner.nextLine();
        if (answer58.equals("c")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'c'");
        }
        // Partition Tilldelning:

        // Fråga 59
        totalQuestions++;
        System.out.println("\nFråga 59: Vad händer när en consumer lämnar eller ansluter sig till en Consumer Group?");
        System.out.println("a) En automatisk omfördelning av partitioner sker");
        System.out.println("b) Inga förändringar i partitionstilldelningen");
        System.out.println("c) Kafka stoppar hela arbetsbelastningen");
        String answer59 = scanner.nextLine();
        if (answer59.equals("a")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'a'");
        }

        // Fråga 60
        totalQuestions++;
        System.out.println("\nFråga 60: Hur hanterar Kafka tilldelningen av partitioner till consumers i en Consumer Group?");
        System.out.println("a) Det görs manuellt av administratören");
        System.out.println("b) Det sker automatiskt för att säkerställa en jämn arbetsbelastning");
        System.out.println("c) Kafka tillåter bara en consumer i gruppen åt gången");
        String answer60 = scanner.nextLine();
        if (answer60.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Offset Hantering:

        // Fråga 61
        totalQuestions++;
        System.out.println("\nFråga 61: Vad är offset i samband med Apache Kafka Consumer Groups?");
        System.out.println("a) Ett mått på datalagrets storlek");
        System.out.println("b) En unik identifierare för varje partition");
        System.out.println("c) En läsposition för varje consumer i gruppen");
        String answer61 = scanner.nextLine();
        if (answer61.equals("c")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'c'");
        }

        // Fråga 62
        totalQuestions++;
        System.out.println("\nFråga 62: Hur hjälper offset consumers att hantera meddelanden effektivt?");
        System.out.println("a) Genom att lagra alla meddelanden på en gång");
        System.out.println("b) Genom att hålla reda på det senaste lästa meddelandet i varje partition");
        System.out.println("c) Genom att ignorera nya meddelanden och endast bearbeta gamla");
        String answer62 = scanner.nextLine();
        if (answer62.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Meddelandeformat:

        // Fråga 63
        totalQuestions++;
        System.out.println("\nFråga 63: Vad är syftet med XPath (XML Path Language) när det gäller XML-filer?");
        System.out.println("a) Att omvandla XML till HTML-format");
        System.out.println("b) Att navigera och söka i XML-hierarkier");
        System.out.println("c) Att komprimera XML-data");
        String answer63 = scanner.nextLine();
        if (answer63.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Fråga 64
        totalQuestions++;
        System.out.println("\nFråga 64: Vilken typ av struktur använder XML, och hur hjälper XPath med detta?");
        System.out.println("a) XML använder en radikalt struktur, och XPath förhindrar det.");
        System.out.println("b) XML använder hierarkisk struktur, och XPath möjliggör navigering i hierarkin.");
        System.out.println("c) XML använder en matematisk struktur, och XPath utför matematiska operationer på den.");
        String answer64 = scanner.nextLine();
        if (answer64.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Fråga 65
        totalQuestions++;
        System.out.println("\nFråga 65: Kan du ge exempel på XML-format som används i praktiken?");
        System.out.println("a) JSON och CSV-filer");
        System.out.println("b) HTML-filer och Maven POM-filer");
        System.out.println("c) Textfiler och binära filer");
        String answer65 = scanner.nextLine();
        if (answer65.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }
        // XPath och XSLT:

        // Fråga 66
        totalQuestions++;
        System.out.println("\nFråga 66: Vad är huvudsyftet med XSLT (Extensible Stylesheet Language Transformations)?");
        System.out.println("a) Att skapa XML-dokument från HTML");
        System.out.println("b) Att omvandla data från XML till andra format som HTML och XHTML");
        System.out.println("c) Att skapa XML-hierarkier från JSON-data");
        String answer66 = scanner.nextLine();
        if (answer66.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Fråga 67
        totalQuestions++;
        System.out.println("\nFråga 67: Vad är den primära användningen av XSLT när det gäller XML?");
        System.out.println("a) Att läsa och ändra XML-metadata");
        System.out.println("b) Att omvandla och transformera data från XML till andra XML-strukturer eller format");
        System.out.println("c) Att komprimera XML-data för snabbare överföring");
        String answer67 = scanner.nextLine();
        if (answer67.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // EDIFACT:

        // Fråga 68
        totalQuestions++;
        System.out.println("\nFråga 68: Vad står förkortningen 'EDIFACT' för och vad är dess huvudsakliga syfte?");
        System.out.println("a) Det står för 'Electronic Data Integration Format' och används för att strukturera JavaScript-kod.");
        System.out.println("b) Det står för 'Electronic Data Interchange for Administration, Commerce, and Transport' och används som ett internationellt standardmeddelandeformat för datautbyte mellan företag och organisationer.");
        System.out.println("c) Det står för 'Effective Data Interaction for Commercial Transactions' och används för att skapa webbapplikationer.");
        String answer68 = scanner.nextLine();
        if (answer68.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // JSON:

        // Fråga 69
        totalQuestions++;
        System.out.println("\nFråga 69: Vad betyder JSON som förkortning och vad är dess kännetecken?");
        System.out.println("a) Det står för 'JavaScript Only Notation' och är känd för att vara komplex och svårförståelig.");
        System.out.println("b) Det står för 'JavaScript Object Notation' och är självbeskrivande, samt används för att bevara och överföra data i JavaScript-format.");
        System.out.println("c) Det står för 'Java Standard Object Naming' och används endast för att namnge Java-objekt.");
        String answer69 = scanner.nextLine();
        if (answer69.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Skriva JSON-objekt:

        // Fråga 70
        totalQuestions++;
        System.out.println("\nFråga 70: Vilken metod används för att skriva data i JSON-format?");
        System.out.println("a) Använda XML-kodning");
        System.out.println("b) Skriva data i name/value-par");
        System.out.println("c) Använda SQL-databas");
        String answer70 = scanner.nextLine();
        if (answer70.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Fråga 71
        totalQuestions++;
        System.out.println("\nFråga 71: Hur separeras name/value-par och datavärden i JSON?");
        System.out.println("a) Med semikolon");
        System.out.println("b) Med kolon");
        System.out.println("c) Med kommatecken");
        String answer71 = scanner.nextLine();
        if (answer71.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Fråga 72
        totalQuestions++;
        System.out.println("\nFråga 72: Vilket tecken används för att hålla ett JSON-objekt?");
        System.out.println("a) Hakparenteser [ ]");
        System.out.println("b) Måsvingar { }");
        System.out.println("c) Fyrkanter [ ]");
        String answer72 = scanner.nextLine();
        if (answer72.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Fråga 73
        totalQuestions++;
        System.out.println("\nFråga 73: Vad är viktigt när du anger fältnamn i JSON?");
        System.out.println("a) De måste anges som numeriska värden");
        System.out.println("b) De måste anges som strängar");
        System.out.println("c) De kan utelämnas eftersom JSON är självbeskrivande");
        String answer73 = scanner.nextLine();
        if (answer73.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Fråga 74
        totalQuestions++;
        System.out.println("\nFråga 74: Vad indikerar @Configuration-annotationen i Spring och var används den oftast?");
        System.out.println("a) Det markerar en metod som ska köras vid konfigurationen av en klass.");
        System.out.println("b) Det markerar en klass som innehåller en eller flera bean-definitioner och används i Spring för att ange konfigurationsklasser.");
        System.out.println("c) Det används för att definiera en HTTP-förfrågningssökväg i en Spring Controller.");
        String answer74 = scanner.nextLine();
        if (answer74.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Spring och Kafka:

        // Fråga 75
        totalQuestions++;
        System.out.println("\nFråga 75: Hur används @Bean-annotationen i Spring och vad representerar en 'bean' i detta sammanhang?");
        System.out.println("a) Det markerar en klass som är en tjänstkomponent i Spring.");
        System.out.println("b) Det används för att definiera en HTTP-GET-förfrågning i en Spring Controller.");
        System.out.println("c) Det används för att ange en metod som producerar en Spring-bean, som är ett objekt som hanteras av Spring Container.");
        String answer75 = scanner.nextLine();
        if (answer75.equals("c")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'c'");
        }

        // Fråga 76
        totalQuestions++;
        System.out.println("\nFråga 76: Vad är syftet med @Service-annotationen i Spring och vilken typ av klasser brukar den markera?");
        System.out.println("a) Den markerar klasser som används för att logga meddelanden.");
        System.out.println("b) Den markerar klasser som innehåller affärslogik och tjänstelagerkod och används för att ange att en klass är en tjänstkomponent i Spring.");
        System.out.println("c) Den används för att definiera en URL-sökväg för att skapa webbtjänster i en Spring-applikation.");
        String answer76 = scanner.nextLine();
        if (answer76.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Fråga 77
        totalQuestions++;
        System.out.println("\nFråga 77: Vad är huvudsyftet med KafkaTemplate i Apache Kafka?");
        System.out.println("a) Det används för att definiera en HTTP-GET-förfrågning i en Kafka-producent.");
        System.out.println("b) Det erbjuder en högnivåabstraktion för att förenkla och effektivisera produktionen av meddelanden till Kafka-ämnen.");
        System.out.println("c) Det används för att definiera logik för att hantera HTTP-förfrågningar i en Spring-applikation.");
        String answer77 = scanner.nextLine();
        if (answer77.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Fråga 78
        totalQuestions++;
        System.out.println("\nFråga 78: Vad är syftet med en Logger i Java och vilken typ av information kan den spåra?");
        System.out.println("a) Den används för att generera HTML-sidor från XML-filer.");
        System.out.println("b) Den används för att logga meddelanden och spåra information av olika nivåer, inklusive felmeddelanden, varningar, information och debuginformation.");
        System.out.println("c) Den används för att definiera ett HTTP-endpoint i en Spring Controller.");
        String answer78 = scanner.nextLine();
        if (answer78.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Fråga 79
        totalQuestions++;
        System.out.println("\nFråga 79: Vad gör @RestController i en Spring-applikation och vilken typ av HTTP-förfrågningar kan den hantera?");
        System.out.println("a) Den används för att markera primärnyckelsfälten i en JPA-entitetsklass.");
        System.out.println("b) Den används för att skapa webbtjänster och hantera HTTP-förfrågningar, inklusive att returnera data i JSON-format.");
        System.out.println("c) Den används för att skapa en Kafka-konsument i en Spring-applikation.");
        String answer79 = scanner.nextLine();
        if (answer79.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Fråga 80
        totalQuestions++;
        System.out.println("\nFråga 80: Vilken annotation används för att koppla en metod i en kontrollklass till en specifik URL-sökväg eller HTTP-förfråningstyp?");
        System.out.println("a) @RequestMapping");
        System.out.println("b) @GetMapping");
        System.out.println("c) @RequestParam");
        String answer80 = scanner.nextLine();
        if (answer80.equals("a")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'a'");
        }

        // Fråga 81
        totalQuestions++;
        System.out.println("\nFråga 81: Vad innebär @RequestParam-annotationen i en Spring Controller och när används den?");
        System.out.println("a) Den används för att definiera hur primärnyckelvärden genereras automatiskt.");
        System.out.println("b) Den används för att ta emot och använda data som skickas med en HTTP-GET-förfrågan eller POST-förfrågan.");
        System.out.println("c) Den används för att definiera inställningar för den underliggande databastabellen som en JPA-entitet ska mappas till.");
        String answer81 = scanner.nextLine();
        if (answer81.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Fråga 82
        totalQuestions++;
        System.out.println("\nFråga 82: Vad är syftet med @KafkaListener-annotationen i Apache Kafka och vad gör den möjligt?");
        System.out.println("a) Den används för att markera primärnyckelsfälten i en JPA-entitetsklass.");
        System.out.println("b) Den aktiverar en komponent som lyssnar på och konsumerar meddelanden från Kafka-ämnen, vilket gör det möjligt att skapa en Kafka-konsument i en Spring-applikation.");
        System.out.println("c) Den används för att definiera hur primärnyckelvärdena genereras automatiskt.");
        String answer82 = scanner.nextLine();
        if (answer82.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Mjukvaruutveckling och Testing:

        // Fråga 83
        totalQuestions++;
        System.out.println("\nFråga 83: Vad markerar @Entity-annotationen i JPA och vad representerar en JPA-entitet?");
        System.out.println("a) Den används för att markera en Java-klass som en komponent i Spring.");
        System.out.println("b) Den används för att definiera en HTTP-GET-förfrågning i en Spring Controller.");
        System.out.println("c) Den används för att markera en Java-klass som en JPA-entitet, vilket representerar data som kan sparas i en databas.");
        String answer83 = scanner.nextLine();
        if (answer83.equals("c")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'c'");
        }

        // Fråga 84
        totalQuestions++;
        System.out.println("\nFråga 84: Vad är syftet med @Table-annotationen i JPA och vad kan den användas för att anpassa?");
        System.out.println("a) Den används för att markera primärnyckelsfälten i en JPA-entitetsklass.");
        System.out.println("b) Den används för att definiera en HTTP-GET-förfrågning i en Spring Controller.");
        System.out.println("c) Den används för att anpassa inställningarna för den underliggande databastabellen som en JPA-entitet ska mappas till.");
        String answer84 = scanner.nextLine();
        if (answer84.equals("c")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'c'");
        }

        // Fråga 85
        totalQuestions++;
        System.out.println("\nFråga 85: Vad representerar @Id-annotationen i en JPA-entitetsklass och vilken typ av fält markerar den?");
        System.out.println("a) Den används för att definiera hur primärnyckelvärdena genereras automatiskt.");
        System.out.println("b) Den används för att markera primärnyckelsfälten i en JPA-entitetsklass.");
        System.out.println("c) Den används för att skapa en Kafka-konsument i en Spring-applikation.");
        String answer85 = scanner.nextLine();
        if (answer85.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Fråga 86
        totalQuestions++;
        System.out.println("\nFråga 86: Vad är syftet med @GeneratedValue-annotationen i JPA och vad gör den möjligt?");
        System.out.println("a) Den används för att markera primärnyckelsfälten i en JPA-entitetsklass.");
        System.out.println("b) Den används för att definiera hur primärnyckelvärdena genereras automatiskt.");
        System.out.println("c) Den används för att definiera inställningar för den underliggande databastabellen som en JPA-entitet ska mappas till.");
        String answer86 = scanner.nextLine();
        if (answer86.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Fråga 87
        totalQuestions++;
        System.out.println("\nFråga 87: Vad hände den 8 september 2005 som påverkade internettrafiken och ledde till kryptering av en stor del av nättrafiken?");
        System.out.println("a) En omfattande hackerattack lamade många webbplatser.");
        System.out.println("b) Torrent-trafiken, som utgjorde 30-40% av konsumenters internettrafik, blev krypterad för första gången.");
        System.out.println("c) En global strömavbrott orsakade av tekniska problem.");
        String answer87 = scanner.nextLine();
        if (answer87.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Fråga 88
        totalQuestions++;
        System.out.println("\nFråga 88: Vad är 'rekursion' inom programmering och hur fungerar det?");
        System.out.println("a) Rekursion är en programmeringsteknik där en funktion kan använda sig av sitt eget definitionsmönster för att lösa problem.");
        System.out.println("b) Rekursion innebär att en funktion alltid kallar en annan funktion för att lösa problemet.");
        System.out.println("c) Rekursion är en metod för att göra en algoritm snabbare genom att öka hastigheten på beräkningar.");
        String answer88 = scanner.nextLine();
        if (answer88.equals("a")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'a'");
        }

        // Fråga 89
        totalQuestions++;
        System.out.println("\nFråga 89: Vad är skillnaden mellan en entityklass, repositoryklass och serviceklass inom mjukvaruutveckling?");
        System.out.println("a) En entityklass representerar vanligtvis dataobjekt med attribut, en repositoryklass hanterar dataåtkomst och en serviceklass innehåller affärslogik.");
        System.out.println("b) Entityklasser används för att spara data, repositoryklasser används för att utföra databasoperationer, och serviceklasser innehåller användningsfallslogik.");
        System.out.println("c) En entityklass representerar användardata, en repositoryklass hanterar autentisering, och en serviceklass används för att visa data i användargränssnittet.");
        String answer89 = scanner.nextLine();
        if (answer89.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Fråga 90
        totalQuestions++;
        System.out.println("\nFråga 90: Vad är huvudsyftet med en repositoryklass inom mjukvaruutveckling?");
        System.out.println("a) Att skapa användargränssnittet för applikationen.");
        System.out.println("b) Att hantera dataåtkomst och abstrahera databasoperationer.");
        System.out.println("c) Att utföra affärslogik och beräkningar.");
        String answer90 = scanner.nextLine();
        if (answer90.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Fråga 91
        totalQuestions++;
        System.out.println("\nFråga 91: Vad är unit testing och vad är dess huvudsakliga syfte inom mjukvaruutveckling?");
        System.out.println("a) Unit testing är att testa hela applikationen som en enhet.");
        System.out.println("b) Unit testing är att testa små enheter eller komponenter isolerat för att säkerställa korrekthet.");
        System.out.println("c) Unit testing är att testa användargränssnittet för att se om det är användarvänligt.");
        String answer91 = scanner.nextLine();
        if (answer91.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Fråga 92
        totalQuestions++;
        System.out.println("\nFråga 92: Hur fungerar unit tester och vad är några av dess viktigaste egenskaper?");
        System.out.println("a) Unit tester isolerar inte enheter och är manuella tester.");
        System.out.println("b) Unit tester är automatiserade, isolerar enheter, inkluderar assertioner och ger snabb feedback.");
        System.out.println("c) Unit tester är endast avsedda för att hitta gränsfall i koden.");
        String answer92 = scanner.nextLine();
        if (answer92.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }


        // Fråga 1
        totalQuestions++;
        System.out.println("\nFråga 1: Varför är skalbarhetsproblem en oro när det gäller punkt-till-punkt-integrationer?");
        System.out.println("a) Det finns inga problem med skalbarhet i punkt-till-punkt-integrationer.");
        System.out.println("b) Det kan vara svårt att hantera många punkt-till-punkt-integrationer när verksamheten växer.");
        System.out.println("c) Skalbarhet är inte relevant för integrationer.");
        String answer93 = scanner.nextLine();
        if (answer93.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Fråga 2
        totalQuestions++;
        System.out.println("\nFråga 2: Vilken fördel ger en integrationsplattform genom API-hantering?");
        System.out.println("a) API hjälper till att lagra data i en databas.");
        System.out.println("b) API möjliggör gemensamt gränssnitt för att koppla samman system.");
        System.out.println("c) API har inget att göra med integrationer.");
        String answer94 = scanner.nextLine();
        if (answer94.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Fråga 3
        totalQuestions++;
        System.out.println("\nFråga 3: Varför är det viktigt att ha behörighetskrav för en integrationsplattform?");
        System.out.println("a) Behörighetskrav kan ignoreras för enklare integrationer.");
        System.out.println("b) Det är inte viktigt att ha behörighetskrav.");
        System.out.println("c) För att reglera vilka som ska ha tillgång och använda plattformen.");
        String answer95 = scanner.nextLine();
        if (answer95.equals("c")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'c'");
        }

        // Fråga 4
        totalQuestions++;
        System.out.println("\nFråga 4: Vad innebär grafisk översikt över plattformen i sammanhanget med integrationsplattformar?");
        System.out.println("a) Det handlar om att rita snygga diagram.");
        System.out.println("b) En visuell representation av hur organisationens system är sammankopplade.");
        System.out.println("c) Det har ingen betydelse för integrationer.");
        String answer96 = scanner.nextLine();
        if (answer96.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Fråga 5
        totalQuestions++;
        System.out.println("\nFråga 5: Vilken funktion har integrationsfilter i en integrationsplattform?");
        System.out.println("a) De spelar gitarrmusik.");
        System.out.println("b) De filtrerar vilken information som ska färdas mellan systemen.");
        System.out.println("c) De hanterar filöverföringar.");
        String answer97 = scanner.nextLine();
        if (answer97.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Fråga 6
        totalQuestions++;
        System.out.println("\nFråga 6: Varför är kontinuerlig informationskontroll viktig i integrationsplattformen?");
        System.out.println("a) För att öka komplexiteten.");
        System.out.println("b) För att minska risken för fel vid transformation eller överföring av data.");
        System.out.println("c) Det är inte viktigt att kontrollera informationen.");
        String answer98 = scanner.nextLine();
        if (answer98.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Fråga 7
        totalQuestions++;
        System.out.println("\nFråga 7: Vad möjliggör schemalagda aktiviteter i en integrationsplattform?");
        System.out.println("a) Möjligheten att schemalägga integrationer när som helst.");
        System.out.println("b) Möjligheten att automatisera transformationer och överföringar av data på förutbestämda tider.");
        System.out.println("c) Det är inte relevant för integrationsplattformar.");
        String answer99 = scanner.nextLine();
        if (answer99.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Fråga 8
        totalQuestions++;
        System.out.println("\nFråga 8: Varför är ett varningssystem viktigt i en integrationsplattform?");
        System.out.println("a) Det hjälper användarna att spela gitarr.");
        System.out.println("b) Det varnar om det uppstår misstänkta eller bekräftade fel i systemet.");
        System.out.println("c) Det är inte viktigt att ha ett varningssystem.");
        String answer100 = scanner.nextLine();
        if (answer100.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

// Fråga 1
        totalQuestions++;
        System.out.println("\nFråga 1: Vad är huvudsakliga användningsområden för API inom integrationsplattformar?");
        System.out.println("a) Att spela musik");
        System.out.println("b) Systemintegration och kommunikation mellan system");
        System.out.println("c) Skapa mobilappar");
        String answer101 = scanner.nextLine();
        if (answer101.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Fråga 2
        totalQuestions++;
        System.out.println("\nFråga 2: Hur används API inom dataintegration?");
        System.out.println("a) För att spela gitarr");
        System.out.println("b) För att hämta och dela data mellan system och databaser");
        System.out.println("c) För att skapa en webbplats");
        String answer102 = scanner.nextLine();
        if (answer102.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Fråga 3
        totalQuestions++;
        System.out.println("\nFråga 3: Vad är partnerintegration med hjälp av API?");
        System.out.println("a) Att skapa en webbplats för samarbetspartners");
        System.out.println("b) Att använda API för att skapa integrationspunkter för samarbetspartners och tredjepartutvecklare");
        System.out.println("c) Att utöka funktionaliteten hos mobilappar");
        String answer103 = scanner.nextLine();
        if (answer103.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Fråga 4
        totalQuestions++;
        System.out.println("\nFråga 4: Vilket användningsområde för API handlar om att integrera IoT-enheter och sensorer?");
        System.out.println("a) Internet of Things (IoT)-integration");
        System.out.println("b) Mobilintegration");
        System.out.println("c) Eventbaserad integration");
        String answer104 = scanner.nextLine();
        if (answer104.equals("a")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'a'");
        }

        // Fråga 5
        totalQuestions++;
        System.out.println("\nFråga 5: Vad är eventbaserad integration med hjälp av API?");
        System.out.println("a) Att skapa evenemang för företagsfester");
        System.out.println("b) Att använda APIer för att implementera event-driven integration");
        System.out.println("c) Att spela musik på evenemang");
        String answer105 = scanner.nextLine();
        if (answer105.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Fråga 6
        totalQuestions++;
        System.out.println("\nFråga 6: Vilket användningsområde för API handlar om att integrera externa applikationer och tjänster med befintliga system?");
        System.out.println("a) Applikationsintegration");
        System.out.println("b) Systemintegration");
        System.out.println("c) Dataintegration");
        String answer106 = scanner.nextLine();
        if (answer106.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Fråga 7
        totalQuestions++;
        System.out.println("\nFråga 7: Hur hjälper API med att utöka funktionaliteten hos befintliga system?");
        System.out.println("a) Genom att skapa nya system");
        System.out.println("b) Genom att integrera externa applikationer och tjänster");
        System.out.println("c) Genom att bygga helt nya plattformar");
        String answer107 = scanner.nextLine();
        if (answer107.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Fråga 8
        totalQuestions++;
        System.out.println("\nFråga 8: Vad är huvudsyftet med API inom mobilintegration?");
        System.out.println("a) Att bygga datorprogram");
        System.out.println("b) Att möjliggöra kommunikation och datautbyte mellan mobilappar och bakomliggande system");
        System.out.println("c) Att spela musik på mobilenheter");
        String answer108 = scanner.nextLine();
        if (answer108.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Fråga 9
        totalQuestions++;
        System.out.println("\nFråga 9: Hur används API inom systemintegration?");
        System.out.println("a) För att lagra data i en databas");
        System.out.println("b) För att koppla samman olika system och appar och möjliggöra kommunikation och datautbyte mellan dem");
        System.out.println("c) För att skapa webbplatser");
        String answer109 = scanner.nextLine();
        if (answer109.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Fråga 10
        totalQuestions++;
        System.out.println("\nFråga 10: Vad innebär Internet of Things (IoT)-integration med API?");
        System.out.println("a) Att integrera olika internetanslutna enheter");
        System.out.println("b) Att använda API för att skapa mobilappar");
        System.out.println("c) Att spela musik på IoT-enheter");
        String answer110 = scanner.nextLine();
        if (answer110.equals("a")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'a'");
        }

// Fråga 1
        totalQuestions++;
        System.out.println("\nFråga 1: Vad är det främsta problemet med punkt-till-punkt-integrationer mellan olika system?");
        System.out.println("a) Komplexitet och underhåll");
        System.out.println("b) Enkelhet och skalbarhet");
        System.out.println("c) Säkerhetsrisker");
        String answer111 = scanner.nextLine();
        if (answer111.equals("a")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'a'");
        }

        // Fråga 2
        totalQuestions++;
        System.out.println("\nFråga 2: Vilken typ av problem kan uppstå om något ändras i ett av systemen som är inblandade i en integration?");
        System.out.println("a) Inget problem alls");
        System.out.println("b) Negativ påverkan på integrationen");
        System.out.println("c) Bättre prestanda");
        String answer112 = scanner.nextLine();
        if (answer112.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Fråga 3
        totalQuestions++;
        System.out.println("\nFråga 3: Vad är en fördel med att använda en integrationsplattform istället för punkt-till-punkt-integrationer?");
        System.out.println("a) Ökad komplexitet");
        System.out.println("b) Flexibilitet och kontroll över systemmiljön");
        System.out.println("c) Beroende av specifika system och leverantörer");
        String answer113 = scanner.nextLine();
        if (answer113.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Fråga 4
        totalQuestions++;
        System.out.println("\nFråga 4: Vad gör en integrationsplattform?");
        System.out.println("a) Spelar gitarr");
        System.out.println("b) Skapar kopplingar mot system och bygger integrationsflöden");
        System.out.println("c) Hanterar data i en databas");
        String answer114 = scanner.nextLine();
        if (answer114.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Fråga 5
        totalQuestions++;
        System.out.println("\nFråga 5: Vad är fördelarna med att använda Integration Platforms as a Service (iPaaS)?");
        System.out.println("a) Ökad komplexitet");
        System.out.println("b) Enklare och billigare integration till molnet");
        System.out.println("c) Punkt-till-punkt-kopplingar mellan system");
        String answer115 = scanner.nextLine();
        if (answer115.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Fråga 6
        totalQuestions++;
        System.out.println("\nFråga 6: Vilket är ett viktigt kriterium att överväga när du väljer en iPaaS-lösning?");
        System.out.println("a) Många punkt-till-punkt-integrationer");
        System.out.println("b) Relevant under en lång tid");
        System.out.println("c) Många anpassade koder");
        String answer116 = scanner.nextLine();
        if (answer116.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Fråga 7
        totalQuestions++;
        System.out.println("\nFråga 7: Vilken funktion tillhandahåller en integrationsplattform för analys och rapportering?");
        System.out.println("a) Samlar och analyserar data från olika system");
        System.out.println("b) Spelar musik");
        System.out.println("c) Hanterar användarens inmatning");
        String answer117 = scanner.nextLine();
        if (answer117.equals("a")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'a'");
        }

        // Fråga 8
        totalQuestions++;
        System.out.println("\nFråga 8: Vad är API i sammanhanget med integrationsplattformar?");
        System.out.println("a) Gemensamt gränssnitt för att koppla samman system");
        System.out.println("b) En databas för att lagra information");
        System.out.println("c) Ett sätt att spela gitarr");
        String answer118 = scanner.nextLine();
        if (answer118.equals("a")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'a'");
        }

        // Fråga 9
        totalQuestions++;
        System.out.println("\nFråga 9: Varför är en expanderbar integrationsplattform bra för framtidsplanering?");
        System.out.println("a) Det är billigare");
        System.out.println("b) Det möjliggör enkel expansion med flera system");
        System.out.println("c) Det ökar komplexiteten");
        String answer119 = scanner.nextLine();
        if (answer119.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Fråga 10
        totalQuestions++;
        System.out.println("\nFråga 10: Vad är en portal för utveckling i sammanhanget med integrationsplattformar?");
        System.out.println("a) En portal där användare kan spela spel");
        System.out.println("b) Tillgång till information om tidigare förändringar på plattformen");
        System.out.println("c) En portal för att lagra filer");
        String answer120 = scanner.nextLine();
        if (answer120.equals("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b'");
        }

        // Visa resultat
        System.out.println("\nDitt resultat: " + score + " av " + totalQuestions + " rätt.");
        scanner.close();

    }
}