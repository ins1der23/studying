namespace Models

{
    class Street
    {
        static int nextId;
        public int Id { get; private set; }
        public string? Name { get; set; }
        public int CityId { get; private set; }
        public virtual City City { get; set; }

        public Street()
        {
            Id = Interlocked.Increment(ref nextId);
            City = new();
        }
    }

    class Streets
    {
        List<Street> StreetsList { get; set; }

        public Streets()
        {
            StreetsList = new();
        }
    }
}