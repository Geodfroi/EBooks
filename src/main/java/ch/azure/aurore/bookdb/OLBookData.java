package ch.azure.aurore.bookdb;

//@JsonIgnoreProperties(ignoreUnknown = true)
public class OLBookData {

    private int cover_i;
    private String subtitle;
    private boolean has_fulltext;
    private String title;
    private String title_suggest;
    private String lending_identifier_s;
    private String ia_collection_s;
    private String type;
    private int ebook_count_i;
    private String printdisabled_s;
    private int edition_count;
    private String key;
    private boolean public_scan_b;
    private long last_modified_i;
    private String lending_edition_s;
    private String cover_edition_key;
    private int first_publish_year;
    private String[] author_name;
    private int[] publish_year;
    private String[] seed;
    private String[] subject;
    private String[] author_alternative_name;
    private String[] isbn;
    private String[] ia_loaded_id;
    private String[] edition_key;
    private String[] language;
    private int[] id_librarything;
    private String[] lcc;
    private int[] id_goodreads;
    private int[] lccn;
    private String[] publish_place;
    private String[] contributor;
    private String[] id_google;
    private String[] ia;
    private String[] text;
    private String[] ddc;
    private String[] author_key;
    private String[] id_overdrive;
    private String[] ia_box_id;
    private String[] first_sentence;
    private long[] oclc;
    private String[] publisher;
    private String[] publish_date;

    public int getCover_i() {
        return cover_i;
    }

    public void setCover_i(int cover_i) {
        this.cover_i = cover_i;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public boolean isHas_fulltext() {
        return has_fulltext;
    }

    public void setHas_fulltext(boolean has_fulltext) {
        this.has_fulltext = has_fulltext;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle_suggest() {
        return title_suggest;
    }

    public void setTitle_suggest(String title_suggest) {
        this.title_suggest = title_suggest;
    }

    public String getLending_identifier_s() {
        return lending_identifier_s;
    }

    public void setLending_identifier_s(String lending_identifier_s) {
        this.lending_identifier_s = lending_identifier_s;
    }

    public String getIa_collection_s() {
        return ia_collection_s;
    }

    public void setIa_collection_s(String ia_collection_s) {
        this.ia_collection_s = ia_collection_s;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getEbook_count_i() {
        return ebook_count_i;
    }

    public void setEbook_count_i(int ebook_count_i) {
        this.ebook_count_i = ebook_count_i;
    }

    public String getPrintdisabled_s() {
        return printdisabled_s;
    }

    public void setPrintdisabled_s(String printdisabled_s) {
        this.printdisabled_s = printdisabled_s;
    }

    public int getEdition_count() {
        return edition_count;
    }

    public void setEdition_count(int edition_count) {
        this.edition_count = edition_count;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public boolean isPublic_scan_b() {
        return public_scan_b;
    }

    public void setPublic_scan_b(boolean public_scan_b) {
        this.public_scan_b = public_scan_b;
    }

    public long getLast_modified_i() {
        return last_modified_i;
    }

    public void setLast_modified_i(long last_modified_i) {
        this.last_modified_i = last_modified_i;
    }

    public String getLending_edition_s() {
        return lending_edition_s;
    }

    public void setLending_edition_s(String lending_edition_s) {
        this.lending_edition_s = lending_edition_s;
    }

    public String getCover_edition_key() {
        return cover_edition_key;
    }

    public void setCover_edition_key(String cover_edition_key) {
        this.cover_edition_key = cover_edition_key;
    }

    public int getFirst_publish_year() {
        return first_publish_year;
    }

    public void setFirst_publish_year(int first_publish_year) {
        this.first_publish_year = first_publish_year;
    }

    public String[] getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String[] author_name) {
        this.author_name = author_name;
    }

    public int[] getPublish_year() {
        return publish_year;
    }

    public void setPublish_year(int[] publish_year) {
        this.publish_year = publish_year;
    }

    public String[] getSeed() {
        return seed;
    }

    public void setSeed(String[] seed) {
        this.seed = seed;
    }

    public String[] getSubject() {
        return subject;
    }

    public void setSubject(String[] subject) {
        this.subject = subject;
    }

    public String[] getAuthor_alternative_name() {
        return author_alternative_name;
    }

    public void setAuthor_alternative_name(String[] author_alternative_name) {
        this.author_alternative_name = author_alternative_name;
    }

    public String[] getIsbn() {
        return isbn;
    }

    public void setIsbn(String[] isbn) {
        this.isbn = isbn;
    }

    public String[] getIa_loaded_id() {
        return ia_loaded_id;
    }

    public void setIa_loaded_id(String[] ia_loaded_id) {
        this.ia_loaded_id = ia_loaded_id;
    }

    public String[] getEdition_key() {
        return edition_key;
    }

    public void setEdition_key(String[] edition_key) {
        this.edition_key = edition_key;
    }

    public String[] getLanguage() {
        return language;
    }

    public void setLanguage(String[] language) {
        this.language = language;
    }

    public int[] getId_librarything() {
        return id_librarything;
    }

    public void setId_librarything(int[] id_librarything) {
        this.id_librarything = id_librarything;
    }

    public String[] getLcc() {
        return lcc;
    }

    public void setLcc(String[] lcc) {
        this.lcc = lcc;
    }

    public int[] getId_goodreads() {
        return id_goodreads;
    }

    public void setId_goodreads(int[] id_goodreads) {
        this.id_goodreads = id_goodreads;
    }

    public int[] getLccn() {
        return lccn;
    }

    public void setLccn(int[] lccn) {
        this.lccn = lccn;
    }

    public String[] getPublish_place() {
        return publish_place;
    }

    public void setPublish_place(String[] publish_place) {
        this.publish_place = publish_place;
    }

    public String[] getContributor() {
        return contributor;
    }

    public void setContributor(String[] contributor) {
        this.contributor = contributor;
    }

    public String[] getId_google() {
        return id_google;
    }

    public void setId_google(String[] id_google) {
        this.id_google = id_google;
    }

    public String[] getIa() {
        return ia;
    }

    public void setIa(String[] ia) {
        this.ia = ia;
    }

    public String[] getText() {
        return text;
    }

    public void setText(String[] text) {
        this.text = text;
    }

    public String[] getDdc() {
        return ddc;
    }

    public void setDdc(String[] ddc) {
        this.ddc = ddc;
    }

    public String[] getAuthor_key() {
        return author_key;
    }

    public void setAuthor_key(String[] author_key) {
        this.author_key = author_key;
    }

    public String[] getId_overdrive() {
        return id_overdrive;
    }

    public void setId_overdrive(String[] id_overdrive) {
        this.id_overdrive = id_overdrive;
    }

    public String[] getIa_box_id() {
        return ia_box_id;
    }

    public void setIa_box_id(String[] ia_box_id) {
        this.ia_box_id = ia_box_id;
    }

    public String[] getFirst_sentence() {
        return first_sentence;
    }

    public void setFirst_sentence(String[] first_sentence) {
        this.first_sentence = first_sentence;
    }

    public long[] getOclc() {
        return oclc;
    }

    public void setOclc(long[] oclc) {
        this.oclc = oclc;
    }

    public String[] getPublisher() {
        return publisher;
    }

    public void setPublisher(String[] publisher) {
        this.publisher = publisher;
    }

    public String[] getPublish_date() {
        return publish_date;
    }

    public void setPublish_date(String[] publish_date) {
        this.publish_date = publish_date;
    }
}
