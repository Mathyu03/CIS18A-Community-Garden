# CIS18A-Community-Garden
CIS18A Course Project 

Community Garden Program Description:

My program will align with Option 2 on the rubric, which is the Community Garden Program. This program will allow the user to register their contact information, and then follow-up by making an appointment to visit the community garden and pick fresh produce at no cost. The user will also have the option to donate money or gardening materials. A weakness of this program is that there would be no UI that the programmer could customize, and it would be purely text based. Also, we don’t have the necessary resources to be able to implement the appointments onto a database to find overlapped schedules between patrons. A great strength, however, of this program is that it provides ease of access for those who want to create an appointment at the community garden, since they could do it electronically as opposed to allocating a good amount of time to book ahead of time in person. Keeping an electronic record of those who come in and out of the garden will also be useful for logistics and connecting patrons to possible issues that may arise from their visit. The target audience for this program will be those who are looking for a relaxing visit in a nature-filled environment, or those who want direct access to secure, fresh foods. It could also be helpful for those who want to educate themselves on the processes for growing food. This program has room for improvement because in the future, it could have a UI and not be completely on text, increasing readability. Another way this program could be improved is by eventually adding the option to print receipts to give users a log of their purchases, rather than a one-time display after ordering.

Pseudocode:

String name, emailAddress
int phoneNum, time, numDonated
Char dayOfWeek, donationAnswer

print welcome message
prompt please enter your name.
input name

prompt please enter your phone number.
input phoneNum

prompt please enter your email
input emailAddress

prompt what day would you like to book an appointment?
print 1: monday 2: tuesday 3: wednesday 4: thursday 5: friday 6: saturday
input dayOfWeek

IF dayOfWeek is 6
	print Enter a time between 8am and 5pm

ELSE
	print Enter a time between 8am and 8pm

input time

display name, phoneNum, time, dayOfWeek //in receipt format

prompt would you like to donate?
print 1: yes 2: no

IF donationAnswer is 1
	
prompt please select the category your donation falls under
	print 1: seeds 2: fertilizer 3: soil 4: gardening tools
		switch (donationAnswer)
			Case 1-4 how many x would you like to donate
			Input numDonated
			print thank you

ELSE
	print exit message


print order summary  (name, num, email, date, time)

