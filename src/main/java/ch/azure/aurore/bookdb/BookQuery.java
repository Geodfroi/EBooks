package ch.azure.aurore.bookdb;

//@JsonIgnoreProperties(ignoreUnknown = true)
public class BookQuery {

    public static String jsonTxt = "{\n" +
            "    \"numFound\": 8,\n" +
            "    \"start\": 0,\n" +
            "    \"docs\": [\n" +
            "        {\n" +
            "            \"cover_i\": 4528004,\n" +
            "            \"subtitle\": \"a novel of Discworld\",\n" +
            "            \"has_fulltext\": true,\n" +
            "            \"title\": \"The fifth elephant\",\n" +
            "            \"title_suggest\": \"The fifth elephant\",\n" +
            "            \"lending_identifier_s\": \"fifthelephant00prat\",\n" +
            "            \"ia_collection_s\": \"printdisabled;fav-indigoshores;stmaryscountylibrary;americana;internetarchivebooks;delawarecountydistrictlibrary;inlibrary;fav-willowweave;china;library_of_atlantis;delawarecountydistrictlibrary-ol;fav-magpie_ix;librarygenesis\",\n" +
            "            \"type\": \"work\",\n" +
            "            \"ebook_count_i\": 2,\n" +
            "            \"printdisabled_s\": \"OL7815225M;OL6788161M\",\n" +
            "            \"edition_count\": 9,\n" +
            "            \"key\": \"/works/OL453951W\",\n" +
            "            \"public_scan_b\": false,\n" +
            "            \"last_modified_i\": 1602128051,\n" +
            "            \"lending_edition_s\": \"OL6788161M\",\n" +
            "            \"cover_edition_key\": \"OL6788161M\",\n" +
            "            \"first_publish_year\": 2000,\n" +
            "            \"author_name\": [\n" +
            "                \"Terry Pratchett\"\n" +
            "            ],\n" +
            "            \"publish_year\": [\n" +
            "                2002,\n" +
            "                2000,\n" +
            "                2001,\n" +
            "                2006,\n" +
            "                2007,\n" +
            "                2008\n" +
            "            ],\n" +
            "            \"seed\": [\n" +
            "                \"/books/OL6788161M\",\n" +
            "                \"/books/OL20093136M\",\n" +
            "                \"/books/OL46027M\",\n" +
            "                \"/books/OL7815225M\",\n" +
            "                \"/books/OL26418442M\",\n" +
            "                \"/books/OL7480459M\",\n" +
            "                \"/books/OL7815563M\",\n" +
            "                \"/books/OL24295859M\",\n" +
            "                \"/books/OL24264702M\",\n" +
            "                \"/works/OL453951W\",\n" +
            "                \"/subjects/literature\",\n" +
            "                \"/subjects/discworld_(imaginary_place)\",\n" +
            "                \"/subjects/fiction\",\n" +
            "                \"/subjects/samuel_vimes_(fictitious_character)\",\n" +
            "                \"/subjects/large_type_books\",\n" +
            "                \"/subjects/fiction_fantasy_general\",\n" +
            "                \"/subjects/carrot_(fictitious_character_:_pratchett)_fiction\",\n" +
            "                \"/subjects/discworld_(imaginary_place)_fiction\",\n" +
            "                \"/authors/OL25712A\"\n" +
            "            ],\n" +
            "            \"subject\": [\n" +
            "                \"Discworld (imaginary place), fiction\",\n" +
            "                \"Literature\",\n" +
            "                \"Discworld (Imaginary place)\",\n" +
            "                \"Accessible book\",\n" +
            "                \"Fiction, fantasy, general\",\n" +
            "                \"Samuel Vimes (Fictitious character)\",\n" +
            "                \"Protected DAISY\",\n" +
            "                \"Large type books\",\n" +
            "                \"Fiction\",\n" +
            "                \"Carrot (fictitious character : pratchett), fiction\"\n" +
            "            ],\n" +
            "            \"author_alternative_name\": [\n" +
            "                \"Pratchett  Terry\",\n" +
            "                \"Terry Pratchett\",\n" +
            "                \"TERRY PRATCHETT\",\n" +
            "                \"Pratchett.\",\n" +
            "                \"Terence David John Pratchett\",\n" +
            "                \"Terri Pratchett\"\n" +
            "            ],\n" +
            "            \"isbn\": [\n" +
            "                \"9781407035208\",\n" +
            "                \"9780552146166\",\n" +
            "                \"0061051578\",\n" +
            "                \"0552154237\",\n" +
            "                \"0413771156\",\n" +
            "                \"9780061347245\",\n" +
            "                \"0552146161\",\n" +
            "                \"0061347248\",\n" +
            "                \"9781407035192\",\n" +
            "                \"9780061806759\",\n" +
            "                \"9780413771155\",\n" +
            "                \"0061806757\",\n" +
            "                \"1407035193\",\n" +
            "                \"9780783893075\",\n" +
            "                \"9780061051579\",\n" +
            "                \"9780552154239\",\n" +
            "                \"8071971790\",\n" +
            "                \"9788071971795\",\n" +
            "                \"0783893078\",\n" +
            "                \"0061347256\",\n" +
            "                \"9780061347252\",\n" +
            "                \"1407035207\"\n" +
            "            ],\n" +
            "            \"ia_loaded_id\": [\n" +
            "                \"fifthelephant00prat\"\n" +
            "            ],\n" +
            "            \"edition_key\": [\n" +
            "                \"OL6788161M\",\n" +
            "                \"OL20093136M\",\n" +
            "                \"OL46027M\",\n" +
            "                \"OL7815225M\",\n" +
            "                \"OL26418442M\",\n" +
            "                \"OL7480459M\",\n" +
            "                \"OL7815563M\",\n" +
            "                \"OL24295859M\",\n" +
            "                \"OL24264702M\"\n" +
            "            ],\n" +
            "            \"language\": [\n" +
            "                \"cze\",\n" +
            "                \"eng\"\n" +
            "            ],\n" +
            "            \"id_librarything\": [\n" +
            "                \"1044978\"\n" +
            "            ],\n" +
            "            \"lcc\": [\n" +
            "                \"PR-6066.00000000.R34 F54 2000\",\n" +
            "                \"PR-6066.00000000.R34 F54 2000b\"\n" +
            "            ],\n" +
            "            \"id_goodreads\": [\n" +
            "                \"78879\",\n" +
            "                \"1186434\",\n" +
            "                \"1141303\",\n" +
            "                \"325379\",\n" +
            "                \"797191\"\n" +
            "            ],\n" +
            "            \"lccn\": [\n" +
            "                \"99043960\",\n" +
            "                \"00046193\"\n" +
            "            ],\n" +
            "            \"publish_place\": [\n" +
            "                \"New York\",\n" +
            "                \"London\",\n" +
            "                \"Thorndike, Me\"\n" +
            "            ],\n" +
            "            \"contributor\": [\n" +
            "                \"Tony Robinson (Narrator)\"\n" +
            "            ],\n" +
            "            \"id_google\": [\n" +
            "                \"NZyZAAAACAAJ\"\n" +
            "            ],\n" +
            "            \"ia\": [\n" +
            "                \"fifthelephant00prat\",\n" +
            "                \"fifthelephantdis00prat\"\n" +
            "            ],\n" +
            "            \"text\": [\n" +
            "                \"OL6788161M\",\n" +
            "                \"OL20093136M\",\n" +
            "                \"OL46027M\",\n" +
            "                \"OL7815225M\",\n" +
            "                \"OL26418442M\",\n" +
            "                \"OL7480459M\",\n" +
            "                \"OL7815563M\",\n" +
            "                \"OL24295859M\",\n" +
            "                \"OL24264702M\",\n" +
            "                \"a novel of Discworld\",\n" +
            "                \"Terry Pratchett\",\n" +
            "                \"fifthelephant00prat\",\n" +
            "                \"fifthelephantdis00prat\",\n" +
            "                \"45008490\",\n" +
            "                \"44694223\",\n" +
            "                \"Tony Robinson (Narrator)\",\n" +
            "                \"9781407035208\",\n" +
            "                \"9780552146166\",\n" +
            "                \"0061051578\",\n" +
            "                \"0552154237\",\n" +
            "                \"0413771156\",\n" +
            "                \"9780061347245\",\n" +
            "                \"0552146161\",\n" +
            "                \"0061347248\",\n" +
            "                \"9781407035192\",\n" +
            "                \"9780061806759\",\n" +
            "                \"9780413771155\",\n" +
            "                \"0061806757\",\n" +
            "                \"1407035193\",\n" +
            "                \"9780783893075\",\n" +
            "                \"9780061051579\",\n" +
            "                \"9780552154239\",\n" +
            "                \"8071971790\",\n" +
            "                \"9788071971795\",\n" +
            "                \"0783893078\",\n" +
            "                \"0061347256\",\n" +
            "                \"9780061347252\",\n" +
            "                \"1407035207\",\n" +
            "                \"OL25712A\",\n" +
            "                \"Discworld (imaginary place), fiction\",\n" +
            "                \"Literature\",\n" +
            "                \"Discworld (Imaginary place)\",\n" +
            "                \"Accessible book\",\n" +
            "                \"Fiction, fantasy, general\",\n" +
            "                \"Samuel Vimes (Fictitious character)\",\n" +
            "                \"Protected DAISY\",\n" +
            "                \"Large type books\",\n" +
            "                \"Fiction\",\n" +
            "                \"Carrot (fictitious character : pratchett), fiction\",\n" +
            "                \"A Discworld novel\",\n" +
            "                \"The fifth elephant\",\n" +
            "                \"/works/OL453951W\",\n" +
            "                \"Terry Pratchett.\",\n" +
            "                \"Random House Publishing Group\",\n" +
            "                \"Corgi Adult\",\n" +
            "                \"Talpress\",\n" +
            "                \"BCA\",\n" +
            "                \"G.K. Hall\",\n" +
            "                \"HarperCollins\",\n" +
            "                \"Corgi\",\n" +
            "                \"Methuen Publishing, Ltd.\",\n" +
            "                \"P\\u00e1t\\u00fd elefant\",\n" +
            "                \"The Fifth Elephant\",\n" +
            "                \"Fifth Elephant\",\n" +
            "                \"99043960\",\n" +
            "                \"00046193\",\n" +
            "                \"Pratchett  Terry\",\n" +
            "                \"Terry Pratchett\",\n" +
            "                \"TERRY PRATCHETT\",\n" +
            "                \"Pratchett.\",\n" +
            "                \"Terence David John Pratchett\",\n" +
            "                \"Terri Pratchett\",\n" +
            "                \"They say the world is flat and supported on the back of four elephants who themselves stand on the back of a giant turtle.\"\n" +
            "            ],\n" +
            "            \"ddc\": [\n" +
            "                \"823.914\"\n" +
            "            ],\n" +
            "            \"author_key\": [\n" +
            "                \"OL25712A\"\n" +
            "            ],\n" +
            "            \"id_overdrive\": [\n" +
            "                \"D8EF93BC-3B08-458F-B587-CB1CD4266DD9\",\n" +
            "                \"41671F60-D0E1-4288-9784-A2B7E719D33E\"\n" +
            "            ],\n" +
            "            \"ia_box_id\": [\n" +
            "                \"IA172101\"\n" +
            "            ],\n" +
            "            \"first_sentence\": [\n" +
            "                \"They say the world is flat and supported on the back of four elephants who themselves stand on the back of a giant turtle.\"\n" +
            "            ],\n" +
            "            \"oclc\": [\n" +
            "                \"45008490\",\n" +
            "                \"44694223\"\n" +
            "            ],\n" +
            "            \"publisher\": [\n" +
            "                \"Random House Publishing Group\",\n" +
            "                \"Corgi Adult\",\n" +
            "                \"Talpress\",\n" +
            "                \"BCA\",\n" +
            "                \"G.K. Hall\",\n" +
            "                \"HarperCollins\",\n" +
            "                \"Corgi\",\n" +
            "                \"Methuen Publishing, Ltd.\"\n" +
            "            ],\n" +
            "            \"publish_date\": [\n" +
            "                \"October 24, 2006\",\n" +
            "                \"2000\",\n" +
            "                \"2001\",\n" +
            "                \"October 25, 2002\",\n" +
            "                \"2007\",\n" +
            "                \"2008\"\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"cover_i\": 10405079,\n" +
            "            \"has_fulltext\": false,\n" +
            "            \"title\": \"The Fifth Elephant\",\n" +
            "            \"title_suggest\": \"The Fifth Elephant\",\n" +
            "            \"type\": \"work\",\n" +
            "            \"ebook_count_i\": 0,\n" +
            "            \"edition_count\": 1,\n" +
            "            \"key\": \"/works/OL21784762W\",\n" +
            "            \"last_modified_i\": 1598731297,\n" +
            "            \"cover_edition_key\": \"OL29667101M\",\n" +
            "            \"first_publish_year\": 2014,\n" +
            "            \"author_name\": [\n" +
            "                \"Pratchett, Terry\"\n" +
            "            ],\n" +
            "            \"publish_year\": [\n" +
            "                2014\n" +
            "            ],\n" +
            "            \"author_key\": [\n" +
            "                \"OL7582434A\"\n" +
            "            ],\n" +
            "            \"seed\": [\n" +
            "                \"/books/OL29667101M\",\n" +
            "                \"/works/OL21784762W\",\n" +
            "                \"/subjects/fiction_fantasy_general\",\n" +
            "                \"/subjects/discworld_(imaginary_place)_fiction\",\n" +
            "                \"/authors/OL7582434A\"\n" +
            "            ],\n" +
            "            \"subject\": [\n" +
            "                \"Discworld (imaginary place), fiction\",\n" +
            "                \"Fiction, fantasy, general\"\n" +
            "            ],\n" +
            "            \"isbn\": [\n" +
            "                \"0062280139\",\n" +
            "                \"9780062280138\"\n" +
            "            ],\n" +
            "            \"edition_key\": [\n" +
            "                \"OL29667101M\"\n" +
            "            ],\n" +
            "            \"publisher\": [\n" +
            "                \"Harper\"\n" +
            "            ],\n" +
            "            \"text\": [\n" +
            "                \"OL29667101M\",\n" +
            "                \"0062280139\",\n" +
            "                \"9780062280138\",\n" +
            "                \"Pratchett, Terry\",\n" +
            "                \"OL7582434A\",\n" +
            "                \"Discworld (imaginary place), fiction\",\n" +
            "                \"Fiction, fantasy, general\",\n" +
            "                \"A Novel of Discworld\",\n" +
            "                \"The Fifth Elephant\",\n" +
            "                \"/works/OL21784762W\",\n" +
            "                \"Harper\"\n" +
            "            ],\n" +
            "            \"publish_date\": [\n" +
            "                \"Apr 29, 2014\"\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"has_fulltext\": false,\n" +
            "            \"title\": \"The Fifth Elephant\",\n" +
            "            \"title_suggest\": \"The Fifth Elephant\",\n" +
            "            \"type\": \"work\",\n" +
            "            \"ebook_count_i\": 0,\n" +
            "            \"edition_count\": 1,\n" +
            "            \"key\": \"/works/OL20624512W\",\n" +
            "            \"last_modified_i\": 1578586752,\n" +
            "            \"first_publish_year\": 1999,\n" +
            "            \"author_name\": [\n" +
            "                \"Terry Pratchett\"\n" +
            "            ],\n" +
            "            \"publish_year\": [\n" +
            "                1999\n" +
            "            ],\n" +
            "            \"author_key\": [\n" +
            "                \"OL25712A\"\n" +
            "            ],\n" +
            "            \"seed\": [\n" +
            "                \"/books/OL27883127M\",\n" +
            "                \"/works/OL20624512W\",\n" +
            "                \"/authors/OL25712A\"\n" +
            "            ],\n" +
            "            \"author_alternative_name\": [\n" +
            "                \"Pratchett  Terry\",\n" +
            "                \"Terry Pratchett\",\n" +
            "                \"TERRY PRATCHETT\",\n" +
            "                \"Pratchett.\",\n" +
            "                \"Terence David John Pratchett\",\n" +
            "                \"Terri Pratchett\"\n" +
            "            ],\n" +
            "            \"isbn\": [\n" +
            "                \"0385409958\",\n" +
            "                \"9780385409957\"\n" +
            "            ],\n" +
            "            \"edition_key\": [\n" +
            "                \"OL27883127M\"\n" +
            "            ],\n" +
            "            \"publisher\": [\n" +
            "                \"Doubleday\"\n" +
            "            ],\n" +
            "            \"text\": [\n" +
            "                \"OL27883127M\",\n" +
            "                \"0385409958\",\n" +
            "                \"9780385409957\",\n" +
            "                \"Terry Pratchett\",\n" +
            "                \"OL25712A\",\n" +
            "                \"The Fifth Elephant\",\n" +
            "                \"/works/OL20624512W\",\n" +
            "                \"Doubleday\",\n" +
            "                \"Pratchett  Terry\",\n" +
            "                \"Terry Pratchett\",\n" +
            "                \"TERRY PRATCHETT\",\n" +
            "                \"Pratchett.\",\n" +
            "                \"Terence David John Pratchett\",\n" +
            "                \"Terri Pratchett\"\n" +
            "            ],\n" +
            "            \"publish_date\": [\n" +
            "                \"1999\"\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"cover_i\": 366576,\n" +
            "            \"has_fulltext\": false,\n" +
            "            \"title\": \"The Fifth Elephant\",\n" +
            "            \"title_suggest\": \"The Fifth Elephant\",\n" +
            "            \"type\": \"work\",\n" +
            "            \"ebook_count_i\": 0,\n" +
            "            \"edition_count\": 1,\n" +
            "            \"key\": \"/works/OL453722W\",\n" +
            "            \"last_modified_i\": 1348429291,\n" +
            "            \"cover_edition_key\": \"OL7815282M\",\n" +
            "            \"first_publish_year\": 1999,\n" +
            "            \"author_name\": [\n" +
            "                \"Terry Pratchett\"\n" +
            "            ],\n" +
            "            \"publish_year\": [\n" +
            "                1999\n" +
            "            ],\n" +
            "            \"author_key\": [\n" +
            "                \"OL25712A\"\n" +
            "            ],\n" +
            "            \"seed\": [\n" +
            "                \"/books/OL7815282M\",\n" +
            "                \"/works/OL453722W\",\n" +
            "                \"/authors/OL25712A\"\n" +
            "            ],\n" +
            "            \"author_alternative_name\": [\n" +
            "                \"Pratchett  Terry\",\n" +
            "                \"Terry Pratchett\",\n" +
            "                \"TERRY PRATCHETT\",\n" +
            "                \"Pratchett.\",\n" +
            "                \"Terence David John Pratchett\",\n" +
            "                \"Terri Pratchett\"\n" +
            "            ],\n" +
            "            \"isbn\": [\n" +
            "                \"9780552147200\",\n" +
            "                \"0552147206\"\n" +
            "            ],\n" +
            "            \"edition_key\": [\n" +
            "                \"OL7815282M\"\n" +
            "            ],\n" +
            "            \"language\": [\n" +
            "                \"eng\"\n" +
            "            ],\n" +
            "            \"id_librarything\": [\n" +
            "                \"1044978\"\n" +
            "            ],\n" +
            "            \"id_goodreads\": [\n" +
            "                \"833497\"\n" +
            "            ],\n" +
            "            \"contributor\": [\n" +
            "                \"Tony Robinson (Narrator)\"\n" +
            "            ],\n" +
            "            \"oclc\": [\n" +
            "                \"44480646\"\n" +
            "            ],\n" +
            "            \"publisher\": [\n" +
            "                \"Corgi Audio\"\n" +
            "            ],\n" +
            "            \"text\": [\n" +
            "                \"OL7815282M\",\n" +
            "                \"9780552147200\",\n" +
            "                \"0552147206\",\n" +
            "                \"Terry Pratchett\",\n" +
            "                \"Tony Robinson (Narrator)\",\n" +
            "                \"44480646\",\n" +
            "                \"OL25712A\",\n" +
            "                \"The Fifth Elephant\",\n" +
            "                \"/works/OL453722W\",\n" +
            "                \"Corgi Audio\",\n" +
            "                \"Pratchett  Terry\",\n" +
            "                \"Terry Pratchett\",\n" +
            "                \"TERRY PRATCHETT\",\n" +
            "                \"Pratchett.\",\n" +
            "                \"Terence David John Pratchett\",\n" +
            "                \"Terri Pratchett\"\n" +
            "            ],\n" +
            "            \"publish_date\": [\n" +
            "                \"November 1, 1999\"\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"cover_i\": 366912,\n" +
            "            \"has_fulltext\": true,\n" +
            "            \"title\": \"Fifth Elephant, The\",\n" +
            "            \"title_suggest\": \"Fifth Elephant, The\",\n" +
            "            \"lending_identifier_s\": \"fifthelephant0000prat\",\n" +
            "            \"ia_collection_s\": \"printdisabled;inlibrary;internetarchivebooks\",\n" +
            "            \"type\": \"work\",\n" +
            "            \"ebook_count_i\": 1,\n" +
            "            \"printdisabled_s\": \"OL7815562M\",\n" +
            "            \"edition_count\": 1,\n" +
            "            \"key\": \"/works/OL453724W\",\n" +
            "            \"public_scan_b\": false,\n" +
            "            \"last_modified_i\": 1598243524,\n" +
            "            \"lending_edition_s\": \"OL7815562M\",\n" +
            "            \"cover_edition_key\": \"OL7815562M\",\n" +
            "            \"first_publish_year\": 2006,\n" +
            "            \"author_name\": [\n" +
            "                \"Terry Pratchett\"\n" +
            "            ],\n" +
            "            \"publish_year\": [\n" +
            "                2006\n" +
            "            ],\n" +
            "            \"author_key\": [\n" +
            "                \"OL25712A\"\n" +
            "            ],\n" +
            "            \"seed\": [\n" +
            "                \"/books/OL7815562M\",\n" +
            "                \"/works/OL453724W\",\n" +
            "                \"/subjects/discworld_(imaginary_place)\",\n" +
            "                \"/subjects/fiction\",\n" +
            "                \"/authors/OL25712A\"\n" +
            "            ],\n" +
            "            \"subject\": [\n" +
            "                \"Accessible book\",\n" +
            "                \"Protected DAISY\",\n" +
            "                \"Discworld (Imaginary place)\",\n" +
            "                \"Fiction\"\n" +
            "            ],\n" +
            "            \"author_alternative_name\": [\n" +
            "                \"Pratchett  Terry\",\n" +
            "                \"Terry Pratchett\",\n" +
            "                \"TERRY PRATCHETT\",\n" +
            "                \"Pratchett.\",\n" +
            "                \"Terence David John Pratchett\",\n" +
            "                \"Terri Pratchett\"\n" +
            "            ],\n" +
            "            \"isbn\": [\n" +
            "                \"0552154229\",\n" +
            "                \"9780552154222\"\n" +
            "            ],\n" +
            "            \"edition_key\": [\n" +
            "                \"OL7815562M\"\n" +
            "            ],\n" +
            "            \"language\": [\n" +
            "                \"eng\"\n" +
            "            ],\n" +
            "            \"id_librarything\": [\n" +
            "                \"1044978\"\n" +
            "            ],\n" +
            "            \"id_goodreads\": [\n" +
            "                \"63720\"\n" +
            "            ],\n" +
            "            \"ia_box_id\": [\n" +
            "                \"IA1911419\"\n" +
            "            ],\n" +
            "            \"ia\": [\n" +
            "                \"fifthelephant0000prat\"\n" +
            "            ],\n" +
            "            \"publisher\": [\n" +
            "                \"Corgi\"\n" +
            "            ],\n" +
            "            \"text\": [\n" +
            "                \"OL7815562M\",\n" +
            "                \"0552154229\",\n" +
            "                \"9780552154222\",\n" +
            "                \"Terry Pratchett\",\n" +
            "                \"fifthelephant0000prat\",\n" +
            "                \"OL25712A\",\n" +
            "                \"Accessible book\",\n" +
            "                \"Protected DAISY\",\n" +
            "                \"Discworld (Imaginary place)\",\n" +
            "                \"Fiction\",\n" +
            "                \"Fifth Elephant, The\",\n" +
            "                \"/works/OL453724W\",\n" +
            "                \"Corgi\",\n" +
            "                \"Pratchett  Terry\",\n" +
            "                \"Terry Pratchett\",\n" +
            "                \"TERRY PRATCHETT\",\n" +
            "                \"Pratchett.\",\n" +
            "                \"Terence David John Pratchett\",\n" +
            "                \"Terri Pratchett\"\n" +
            "            ],\n" +
            "            \"publish_date\": [\n" +
            "                \"November 28, 2006\"\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"cover_i\": 8325814,\n" +
            "            \"has_fulltext\": true,\n" +
            "            \"title\": \"The fifth elephant\",\n" +
            "            \"title_suggest\": \"The fifth elephant\",\n" +
            "            \"lending_identifier_s\": \"fifthelephant00terr\",\n" +
            "            \"ia_collection_s\": \"printdisabled;fav-bluisis;stmaryscountylibrary;internetarchivebooks;worthingtonlibraries-ol;cuny-ol;inlibrary;china;delawarecountydistrictlibrary-ol;fav-maitotytt_\",\n" +
            "            \"type\": \"work\",\n" +
            "            \"ebook_count_i\": 1,\n" +
            "            \"printdisabled_s\": \"OL26641480M\",\n" +
            "            \"edition_count\": 1,\n" +
            "            \"key\": \"/works/OL18160178W\",\n" +
            "            \"public_scan_b\": false,\n" +
            "            \"last_modified_i\": 1558348734,\n" +
            "            \"lending_edition_s\": \"OL26641480M\",\n" +
            "            \"cover_edition_key\": \"OL26641480M\",\n" +
            "            \"first_publish_year\": 2001,\n" +
            "            \"author_name\": [\n" +
            "                \"Terry Pratchett\"\n" +
            "            ],\n" +
            "            \"publish_year\": [\n" +
            "                2001\n" +
            "            ],\n" +
            "            \"ddc\": [\n" +
            "                \"823.914\"\n" +
            "            ],\n" +
            "            \"author_key\": [\n" +
            "                \"OL25712A\"\n" +
            "            ],\n" +
            "            \"seed\": [\n" +
            "                \"/books/OL26641480M\",\n" +
            "                \"/works/OL18160178W\",\n" +
            "                \"/subjects/discworld_(imaginary_place)\",\n" +
            "                \"/subjects/fiction\",\n" +
            "                \"/authors/OL25712A\"\n" +
            "            ],\n" +
            "            \"subject\": [\n" +
            "                \"Accessible book\",\n" +
            "                \"Protected DAISY\",\n" +
            "                \"Discworld (Imaginary place)\",\n" +
            "                \"Fiction\"\n" +
            "            ],\n" +
            "            \"author_alternative_name\": [\n" +
            "                \"Pratchett  Terry\",\n" +
            "                \"Terry Pratchett\",\n" +
            "                \"TERRY PRATCHETT\",\n" +
            "                \"Pratchett.\",\n" +
            "                \"Terence David John Pratchett\",\n" +
            "                \"Terri Pratchett\"\n" +
            "            ],\n" +
            "            \"isbn\": [\n" +
            "                \"9780061020407\",\n" +
            "                \"0061020400\"\n" +
            "            ],\n" +
            "            \"edition_key\": [\n" +
            "                \"OL26641480M\"\n" +
            "            ],\n" +
            "            \"language\": [\n" +
            "                \"eng\"\n" +
            "            ],\n" +
            "            \"lcc\": [\n" +
            "                \"PR-6066.00000000.R34 F44 2001\"\n" +
            "            ],\n" +
            "            \"publish_place\": [\n" +
            "                \"New York\"\n" +
            "            ],\n" +
            "            \"ia_box_id\": [\n" +
            "                \"IA1126606\"\n" +
            "            ],\n" +
            "            \"ia\": [\n" +
            "                \"fifthelephant00terr\"\n" +
            "            ],\n" +
            "            \"oclc\": [\n" +
            "                \"46885201\"\n" +
            "            ],\n" +
            "            \"publisher\": [\n" +
            "                \"HarperTorch\"\n" +
            "            ],\n" +
            "            \"text\": [\n" +
            "                \"OL26641480M\",\n" +
            "                \"9780061020407\",\n" +
            "                \"0061020400\",\n" +
            "                \"Terry Pratchett\",\n" +
            "                \"fifthelephant00terr\",\n" +
            "                \"46885201\",\n" +
            "                \"OL25712A\",\n" +
            "                \"Accessible book\",\n" +
            "                \"Protected DAISY\",\n" +
            "                \"Discworld (Imaginary place)\",\n" +
            "                \"Fiction\",\n" +
            "                \"a novel of discworld\",\n" +
            "                \"The fifth elephant\",\n" +
            "                \"/works/OL18160178W\",\n" +
            "                \"Terry Pratchett\",\n" +
            "                \"HarperTorch\",\n" +
            "                \"Pratchett  Terry\",\n" +
            "                \"Terry Pratchett\",\n" +
            "                \"TERRY PRATCHETT\",\n" +
            "                \"Pratchett.\",\n" +
            "                \"Terence David John Pratchett\",\n" +
            "                \"Terri Pratchett\"\n" +
            "            ],\n" +
            "            \"publish_date\": [\n" +
            "                \"2001\"\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"cover_i\": 261738,\n" +
            "            \"has_fulltext\": false,\n" +
            "            \"title\": \"Terry Pratchett's The fifth elephant\",\n" +
            "            \"title_suggest\": \"Terry Pratchett's The fifth elephant\",\n" +
            "            \"type\": \"work\",\n" +
            "            \"ebook_count_i\": 0,\n" +
            "            \"edition_count\": 1,\n" +
            "            \"key\": \"/works/OL2880311W\",\n" +
            "            \"last_modified_i\": 1602137807,\n" +
            "            \"cover_edition_key\": \"OL3618372M\",\n" +
            "            \"first_publish_year\": 2002,\n" +
            "            \"author_name\": [\n" +
            "                \"Stephen Briggs\"\n" +
            "            ],\n" +
            "            \"publish_year\": [\n" +
            "                2002\n" +
            "            ],\n" +
            "            \"ddc\": [\n" +
            "                \"823.914\"\n" +
            "            ],\n" +
            "            \"author_key\": [\n" +
            "                \"OL435836A\"\n" +
            "            ],\n" +
            "            \"seed\": [\n" +
            "                \"/books/OL3618372M\",\n" +
            "                \"/works/OL2880311W\",\n" +
            "                \"/subjects/discworld_(imaginary_place)\",\n" +
            "                \"/subjects/drama\",\n" +
            "                \"/subjects/english_fantasy_drama\",\n" +
            "                \"/subjects/fantasy_drama_english\",\n" +
            "                \"/subjects/samuel_vimes_(fictitious_character)\",\n" +
            "                \"/subjects/discworld_(imaginary_place)_fiction\",\n" +
            "                \"/subjects/carrot_(fictitious_character_:_pratchett)_fiction\",\n" +
            "                \"/subjects/fiction_fantasy_general\",\n" +
            "                \"/authors/OL435836A\"\n" +
            "            ],\n" +
            "            \"subject\": [\n" +
            "                \"Discworld (imaginary place), fiction\",\n" +
            "                \"Discworld (Imaginary place)\",\n" +
            "                \"English Fantasy drama\",\n" +
            "                \"Fantasy drama, English\",\n" +
            "                \"Fiction, fantasy, general\",\n" +
            "                \"Drama\",\n" +
            "                \"Samuel Vimes (Fictitious character)\",\n" +
            "                \"Carrot (fictitious character : pratchett), fiction\"\n" +
            "            ],\n" +
            "            \"isbn\": [\n" +
            "                \"9780413771155\",\n" +
            "                \"0413771156\"\n" +
            "            ],\n" +
            "            \"edition_key\": [\n" +
            "                \"OL3618372M\"\n" +
            "            ],\n" +
            "            \"language\": [\n" +
            "                \"eng\"\n" +
            "            ],\n" +
            "            \"id_librarything\": [\n" +
            "                \"1044978\"\n" +
            "            ],\n" +
            "            \"lcc\": [\n" +
            "                \"PR-6052.00000000.R4444 T47 2002\",\n" +
            "                \"PR-6052.00000000.R4444T47 2002\"\n" +
            "            ],\n" +
            "            \"id_goodreads\": [\n" +
            "                \"78879\"\n" +
            "            ],\n" +
            "            \"lccn\": [\n" +
            "                \"2002391345\"\n" +
            "            ],\n" +
            "            \"publish_place\": [\n" +
            "                \"London\"\n" +
            "            ],\n" +
            "            \"contributor\": [\n" +
            "                \"Pratchett, Terry.\"\n" +
            "            ],\n" +
            "            \"publisher\": [\n" +
            "                \"Methuen Drama\"\n" +
            "            ],\n" +
            "            \"text\": [\n" +
            "                \"OL3618372M\",\n" +
            "                \"9780413771155\",\n" +
            "                \"0413771156\",\n" +
            "                \"Stephen Briggs\",\n" +
            "                \"Pratchett, Terry.\",\n" +
            "                \"OL435836A\",\n" +
            "                \"Discworld (imaginary place), fiction\",\n" +
            "                \"Discworld (Imaginary place)\",\n" +
            "                \"English Fantasy drama\",\n" +
            "                \"Fantasy drama, English\",\n" +
            "                \"Fiction, fantasy, general\",\n" +
            "                \"Drama\",\n" +
            "                \"Samuel Vimes (Fictitious character)\",\n" +
            "                \"Carrot (fictitious character : pratchett), fiction\",\n" +
            "                \"Terry Pratchett's The fifth elephant\",\n" +
            "                \"/works/OL2880311W\",\n" +
            "                \"adapted by Stephen Briggs.\",\n" +
            "                \"Methuen Drama\",\n" +
            "                \"Fifth elephant\",\n" +
            "                \"2002391345\"\n" +
            "            ],\n" +
            "            \"publish_date\": [\n" +
            "                \"2002\"\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"cover_i\": 8443355,\n" +
            "            \"has_fulltext\": false,\n" +
            "            \"title\": \"The Fifth Elephant: Discworld Novel 24\",\n" +
            "            \"title_suggest\": \"The Fifth Elephant: Discworld Novel 24\",\n" +
            "            \"type\": \"work\",\n" +
            "            \"ebook_count_i\": 0,\n" +
            "            \"edition_count\": 1,\n" +
            "            \"key\": \"/works/OL19332001W\",\n" +
            "            \"last_modified_i\": 1602394006,\n" +
            "            \"cover_edition_key\": \"OL26790049M\",\n" +
            "            \"first_publish_year\": 2016,\n" +
            "            \"author_name\": [\n" +
            "                \"Terry Pratchett\"\n" +
            "            ],\n" +
            "            \"publish_year\": [\n" +
            "                2016\n" +
            "            ],\n" +
            "            \"author_key\": [\n" +
            "                \"OL25712A\"\n" +
            "            ],\n" +
            "            \"seed\": [\n" +
            "                \"/books/OL26790049M\",\n" +
            "                \"/works/OL19332001W\",\n" +
            "                \"/subjects/english_literature\",\n" +
            "                \"/authors/OL25712A\"\n" +
            "            ],\n" +
            "            \"subject\": [\n" +
            "                \"English literature\"\n" +
            "            ],\n" +
            "            \"author_alternative_name\": [\n" +
            "                \"Pratchett  Terry\",\n" +
            "                \"Terry Pratchett\",\n" +
            "                \"TERRY PRATCHETT\",\n" +
            "                \"Pratchett.\",\n" +
            "                \"Terence David John Pratchett\",\n" +
            "                \"Terri Pratchett\"\n" +
            "            ],\n" +
            "            \"isbn\": [\n" +
            "                \"085752416X\",\n" +
            "                \"9780857524164\"\n" +
            "            ],\n" +
            "            \"edition_key\": [\n" +
            "                \"OL26790049M\"\n" +
            "            ],\n" +
            "            \"publisher\": [\n" +
            "                \"Doubleday UK\"\n" +
            "            ],\n" +
            "            \"text\": [\n" +
            "                \"OL26790049M\",\n" +
            "                \"085752416X\",\n" +
            "                \"9780857524164\",\n" +
            "                \"Terry Pratchett\",\n" +
            "                \"OL25712A\",\n" +
            "                \"English literature\",\n" +
            "                \"The Fifth Elephant: Discworld Novel 24\",\n" +
            "                \"/works/OL19332001W\",\n" +
            "                \"Doubleday UK\",\n" +
            "                \"Pratchett  Terry\",\n" +
            "                \"Terry Pratchett\",\n" +
            "                \"TERRY PRATCHETT\",\n" +
            "                \"Pratchett.\",\n" +
            "                \"Terence David John Pratchett\",\n" +
            "                \"Terri Pratchett\"\n" +
            "            ],\n" +
            "            \"publish_date\": [\n" +
            "                \"Nov 22, 2016\"\n" +
            "            ],\n" +
            "            \"lcc\": [\n" +
            "                \"PR-6066.00000000.R34\"\n" +
            "            ]\n" +
            "        }\n" +
            "    ],\n" +
            "    \"num_found\": 8\n" +
            "}\n" +
            "\n" +
            "Process finished with exit code 0\n";

    private int numFound;
    private int start;
    private OLBookData[] docs;
    private int num_found;

    public int getNum_found() {
        return num_found;
    }

    public void setNum_found(int num_found) {
        this.num_found = num_found;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public OLBookData[] getDocs() {
        return docs;
    }

    public void setDocs(OLBookData[] docs) {
        this.docs = docs;
    }

    public int getNumFound() {
        return numFound;
    }

    public void setNumFound(int numFound) {
        this.numFound = numFound;
    }
}
