def call(Map config=[:], Closure body)
{
	node {
		stage("Initial")
		{
			echo "Initial"
		}
		body()
	}
}
