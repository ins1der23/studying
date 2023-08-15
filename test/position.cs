namespace Models
{
    class Position
    {
        static int NextId;
        public int Id { get; private set; }
        public string? Name { get; private set; }

        public Position()
        {
            this.Id = Interlocked.Increment(ref NextId);
        }
        public override string ToString() => $"{this.Name}";
    }
}
