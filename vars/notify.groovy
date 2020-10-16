import org.example.Constants

def call(Map config = [:])
{
	if(config.style == "slack")
	{
		echo Constant.EMAIL_MESSAGE
	}
	else
	{
		echo Constants.SLACK_MESSAGE
	}
	echo config.message
}
