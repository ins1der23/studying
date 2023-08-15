namespace Models
{
   class Worker
    {
        static int NextId;
        public int Id { get; private set; }
        public string? Name { get; set; }
        public string? Surname { get; set; }
        public string FullName
        {
            get
            {
                return $"{Name} {Surname}";
            }
        }
        public DateTime Birthday { get; private set; }
        public int Age
        {
            get
            {
                DateTime today = DateTime.Today;
                int age = today.Year - Birthday.Year;
                if (Birthday > today.AddYears(-age)) age--;
                return age;
            }
        }

        public int PositionId;
        
        public Worker()
        {
            this.Id = Interlocked.Increment(ref NextId);
            // this.Name = name;
            // this.Surname = surname;
            // this.Birthday = date;
            this.PositionId = 1;
        }

        public override string ToString()
        {
            return $"{this.Id}. {this.FullName}, {this.Age}, {this.PositionId}";
        }
    }
}
