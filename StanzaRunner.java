class StanzaRunner {
    public static void main(String[] args) {
        Stanza stanza1 = new Stanza();
        stanza1.displayInfo();

        Stanza stanza2 = new Stanza("Ode to Autumn");
        stanza2.displayInfo();

        Stanza stanza3 = new Stanza("Sonnet 18", "William Shakespeare");
        stanza3.displayInfo();

        Stanza stanza4 = new Stanza("The Raven", "Edgar Allan Poe", 18);
        stanza4.displayInfo();

        Stanza stanza5 = new Stanza("Daffodils", "William Wordsworth", 24, "AABB");
        stanza5.displayInfo();

        Stanza stanza6 = new Stanza("Ozymandias", "Percy Bysshe Shelley", 14, "ABAB", "Power");
        stanza6.displayInfo();

        Stanza stanza7 = new Stanza("The Tyger", "William Blake", 16, "AABB", "Mystery", true);
        stanza7.displayInfo();

        Stanza stanza8 = new Stanza("Invictus", "William Ernest Henley", 8, "ABAB", "Courage", true, "Trochaic");
        stanza8.displayInfo();

        Stanza stanza9 = new Stanza("The Road Not Taken", "Robert Frost", 20, "AABA", "Choices", true, "Iambic", "English");
        stanza9.displayInfo();

        Stanza stanza10 = new Stanza("Stopping by Woods", "Robert Frost", 16, "AABA", "Nature", true, "Iambic", "English", 1923);
        stanza10.displayInfo();

        Stanza stanza11 = new Stanza("If", "Rudyard Kipling", 32, "ABAB", "Wisdom", true, "Iambic", "English", 1910, "Great Poems Collection");
        stanza11.displayInfo();
    }
}
