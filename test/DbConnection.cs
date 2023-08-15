using System;
using MySql.Data.MySqlClient;
namespace Data

{
    public class DBConnection
    {
        public string Server { get; set; }
        public string DatabaseName { get; set; }
        public string UserName { get; private set; }
        private string Password { get; set; }
        public MySqlConnection? Connection { get; set; }

        private DBConnection(string server, string databaseName)
        {
            this.Server = server;
            this.DatabaseName = databaseName;
            this.UserName = "root";
            this.Password = "Hacker$arefuck1ngevil";
        }

        private static DBConnection? _instance = null;
        public static DBConnection Instance(string server, string databaseName)
        {
            if (_instance == null)
                _instance = new DBConnection(server, databaseName);
            return _instance;
        }

        private string SetUsername() => String.Empty + Console.ReadLine();
        private string SetPassword() => String.Empty + Console.ReadLine();
        public async Task ConnectAsync()
        {
            if (Connection == null)
            {
                string connstring = $"Server={Server}; database={DatabaseName}; UID={UserName}; password={Password}";
                try
                {
                    Connection = new MySqlConnection(connstring);
                    await Connection.OpenAsync();
                }
                catch (MySqlException)
                {
                    Console.WriteLine("Неверный ввод данных");
                    _instance = null;
                    Connection = null;
                }
            }
        }
        public bool IsConnect()
        {
            if (Connection !=null) return true;
            else return false;
        }
            
        public void Close()
        {
            if (Connection != null)
                Connection.Close();
            Connection = null;
        }
    }
}