namespace Models

{
    class City
    {
        static int nextId;
        public int Id { get; private set; }
        public string? Name { get; set; }
        public virtual Districts Districts{ get; private set; }
        public virtual Locations Locations{ get; private set; }
        public virtual Streets Streets{ get; private set; }

        public City()
        {
            Id = Interlocked.Increment(ref nextId);
            Districts = new();
            Locations = new();
            Streets = new();
        }
    }
    class Cities
    {
        List<City> CitiesList { get; set; }

        public Cities()
        {
            CitiesList = new();
        }
    }
}