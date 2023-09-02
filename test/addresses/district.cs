namespace Models
{
    class District
    {
        static int nextId;
        public int Id { get; private set; }
        public string? Name { get; set; }
        public int CityId { get; private set; }
        public virtual City City { get; set; }

        public District()
        {
            Id = Interlocked.Increment(ref nextId);
            City = new();
        }
    }
    class Districts
    {
        List<District> DistrictsList { get; set; }
        public Districts()
        {
            DistrictsList = new();
        }
    }
}