package com.kashtbhanjan.hanumanuniverse;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.kashtbhanjan.hanumanuniverse.databinding.ActivityTemplesBinding;

public class temples extends AppCompatActivity {

    private ActivityTemplesBinding binding;

    int templeImage[] = {R.drawable.temple1, R.drawable.temple2, R.drawable.temple3, R.drawable.temple4, R.drawable.temple5, R.drawable.temple6, R.drawable.temple7, R.drawable.temple8, R.drawable.temple9, R.drawable.temple10,};

    String templename[] = {"sarangpur", "himachal pradesh", "varansi", "jamnager", "Dehil", "Aayodhya", "Alahabad", "Ahmedabad", "Rajsthan", "Telangana"};


    String templeplace[] = {"        Shree Kashtabhanjan dev Hanumanji Mandir P.O.Salangpur(Hanuman Tal:Barwala, Dist, Sarangpur, Gujarat 382450",
            "        Jakhu Temple Park, Jakhu, Shimla, Himachal Pradesh 171001",
            "        Meerghat , Near, Sri Kasi Vishalakshi Devi Temple, Vishwanath Galli, Lahori Tola, Varanasi, Uttar Pradesh 221001",
            "        F37C+4HC, Shri Prembhikshuji Marg, near Lakhota Lake, Government Colony, Jamnagar, Gujarat 361008",
            "        Desh Bandhu Gupta Rd, Block E, Jhandewalan Extension, Paharganj, New Delhi, Delhi 110055",
            "        Sai Nagar, Ayodhya, Uttar Pradesh 224123",
            "        Allahabad fort, Prayagraj, Uttar Pradesh 211005",
            "        Airport Rd, Ahmedabad Cantonment, Ahmedabad, Gujarat 380004",
            "        Mehandipur, Tehsil, Sikrai, Rajasthan 321610",
            "        8-2-61, Inner Ring Rd, Virat Nagar, Champapet, Telangana 500079"};

    String templedescription[] = {"        This temple is among the more prominent ones in the original Swaminarayan Sampraday. The idol of Hanuman was installed by Gopalanand Swami. According to author Raymond Williams, it is reported that when Sadguru Gopal Anand Swami installed the idol of Hanuman, he touched it with a rod and the idol came alive and moved. This story has become a charter for the healing ritual performed at this temple. The idol of Hanuman here is a stout figure with a handlebar moustache, crushing a female demon under his foot and baring his teeth, standing among sculpted foliage full of fruit bearing monkey attendants. In 1899, Kothari Gordhandas of Vadtal appointed Shastri Yagnapurushdas to manage the affairs of the mandir; during his tenure, Shastri Yagnapurushdas renovated the site, built the adjacent bungalow, and acquired more land for the complex to bring it to its current state. Yagnapurushdas then broke away in 1907 and created BAPS. Govardhandas then appointed a new mahant of the temple of Sarangpur. Since, then the Vadtal Gadi has constructed additional improvements and buildings to the temple.\n" +
            "The image of this temple is said to be so powerful that a mere look at it will drive the evil spirits out of the people affected by them. Saturday is the designated day for a special ritual (as Saturday is dedicated to Hanuman) for those affected by mental illnesses and other disorders. They are brought to the temple to be touched by the rod used by Sadguru Gopalanand Swami during the installation ceremony of the image. This rod has now been covered in gold. The temple administration has hired a brahmin householder to act as a priest at the temple and conduct this ritual. After this, the person affected is instructed to circumambulate the shrine and repeat this after doing darshan a number of times. Some people take a special vow to do this a certain number of times or to chant the Swaminarayan Mahamantra while doing this.",
            "        Shri Hanuman Jakhu, deemed to be as the Pride of Shimla, is a statue of Lord Hanuman situated under the periphery of Jakhu Temple on Jakhu Hill in Shimla. It is one of the tallest statues in the world with the height of 33 metres (108 feet).\n  Legacy:-\n" +
                    "The statue is built on the Jakhu Hill which is the highest hill out of the seven hills of Shimla. Its construction was started in 2008 and completed in the year 2010, inaugurated and built by the Managing Director of JHS Svendgaard Laboratories Ltd, the largest oral-care manufacturing Company in India, Nikhil Nanda and the then Chief Minister of Himachal Pradesh, Prem Kumar Dhumal. The staue is a gift by the HC Nanda Charitable Trust to the state. The statue is 108 feet tall and overlooks the city of Shimla from the 8,850 foot hilltop. In comparison, it surpasses the Brazil's, Christ the Redeemer statue which is 98 feet tall. It has been filed in the Guinness Book of World Record as the tallest Statue of Shri Hanuman in the world. The statue towers high above the trees and is visible from several points in Shimla. The area around the statue has been developed so that visiting families can spend time comfortably here. A park is built with swings and slides is located nearby. Many devotees from different parts of the nation come and visit the temple everyday to seek strenghth peace and sanity.",
            "        ankat Mochan Hanuman Temple is a Hindu temple in Varanasi, Uttar Pradesh, India and is dedicated to the Hindu God Hanuman. The temple was established by famous Hindu preacher and poet saint Sri Goswami Tulsidas in the early 16th century and is situated on the banks of the Assi river. The deity was named \"Sankat Mochan\" meaning the \"reliever from troubles\".\n" +
                    "\n" +
                    "  In the temple, offerings to Lord Hanuman (called Prasad) are sold like the special sweet \"besan ke ladoo\", which the devotees relish; the idol is also decked with a pleasant marigold flower garland as well. This temple has the unique distinction of having Lord Hanuman facing his Lord, Rama, whom he worshipped with steadfast and selfless devotion.\n" +
                    "\n" +
                    "  History:-\n" +
                    "  It is believed that the temple has been built on the very spot where Tulsidas had a vision of Hanuman. Sankat Mochan Temple was founded by Tulsidas who was the author of the Ramacharitamanasa, which is the greatest version of lord Ram story written in Avadhi (\"Most of the people having confusion that Ramacharitamanasa is a avadhi version of Valmiki Ramayana but Ramacharitamanasa is different from Sanskrit Ramayana written by rishi Valmiki as Baba Tulsidas Ji already told in Ramacharitamanasa that \"Nana bhanti Ram avatara, Ramayan sat koti apara\" means in each Kalp lord Ram takes Avatar & plays different-2 lilas(Act) so we have different stories of same lord Ram\").Tradition promises that regular visitors to the temple will gain the special favor of Lord Hanuman. Every Tuesday and Saturday thousands of people queue up in front of the temple to offer prayers to Lord Hanuman. According to Vedic Astrology, Hanuman saves human beings from the anger of the planet Shani (Saturn), and especially people who have a  n ill-placed Saturn in their horoscopes visit this temple for astrological remedies. This is supposed to be the most effective way for appeasing Shani. While it is suggested that Hanuman did not hesitate to engulfs in his mouth the sun, the lord of all planets, which humbled all the gods and angels, making them worship him for the Sun's release. Some astrologers believe that worshiping Hanuman can neutralize the ill-effect of Mangal (Mars) and practically any planet that has an ill effect on human life. It is believed that Tulsidas is believed to have written most of the verses of Ramacharitramanas in this temple.\n" +
                    "\n" +
                    " Terrorist incident:-\n" +
                    " Main article: 2006 Varanasi bombings\n" +
                    " On 7 March 2006, one of three explosions hit the temple while the aarti was in progress in which numerous worshippers and wedding attendees were participating. The crowd helped each other in the rescue operation after the explosion. The next day a large number of devotees resumed their worship as usual.\n" +
                    "\n" +
                    " Temple today:-\n" +
                    " The temple still continues to be attended by thousands of Rama and Hanuman devotees who chant Hanuman Chalisa and Sundarkand (also provided in the form of a booklet in the temple for free). After the terrorist incident of 2006, a permanent police post was set up inside the temple.\n" +
                    "\n" +
                    " Sankat Mochan temple is near the Banaras Hindu University.\n" +
                    "\n" +
                    " Sankat Mochan Foundation:-\n" +
                    " Main article: Sankat Mochan Foundation\n" +
                    " The Sankat Mochan Foundation (SMF) was established in 1982 by Veer Bhadra Mishra, the Mahant (High priest) of the temple, and has been working for cleaning and protecting the Ganges river. Its projects are funded in part by aid from the U. S. and Swedish governments. Mishra was formerly former Head of the Civil Engineering Department at the Indian Institute of Technology (BHU) Varanasi [IIT(BHU)] and was awarded United Nations Environment Programme (UNEP) established the \"Global 500 Roll of Honour\" in 1992 and later the TIME magazine's \"Hero of the Planet\" award in 1999.\n" +
                    "\n" +
                    " The foundation has been working with Australia-based environmental group, Oz Greene, under a programme called \"Swatcha Ganga Abhiyan\" for over 25 years. It celebrated its silver jubilee on 3–4 November 2007, with two-day event which concluded at the Tulsi Ghat, on the Ganges.[10]\n" +
                    "\n",
            "        Bala Hanuman Temple, also known as Shri Balahanuman Sankirtan Mandir is situated at the south east side of Ranmal Lake (or Lakhota Lake) in Jamnagar. Dedicated to Lord Hanuman, the temple is separated from the lake by a wide road. The simple looking structure houses the idols of Lord Ram, Lord Lakshman, Goddess Sita and Lord Hanuman.\n" +
                    "\n" +
                    "   Since 1st August, 1964, chanting of Ram dhun – 'Shri Ram, Jai Ram, Jai Jai Ram' goes on in the temple premises, day in and day out. This 24x7 ritual has been acknowledged and listed by the Guinness Book of World Records. Local population has deep faith in the temple and believes that it guards them from natural calamities and other troubles. Arti (ritual of worship) takes place twice in a day (morning and evening). The evening arti is the most awaited event of the day.\n" +
                    "\n" +
                    "   The Lakhota Lake is visited by various species of birds, particularly during the period of migration, making the overall atmosphere more special. Lakhota Fort and Museum are located on an island inside the lake and can be reached through two pathways that connect them with the bank. One can enhance the fun by indulging in boating inside the lake.\n" +
                    "\n" +
                    "   How to Reach Bala Hanuman Temple?\n" +
                    "\n" +
                    "   By Bus: Jamnagar is well-connected through various state and national highways. Many state and private buses ply between Jamnagar and other cities of Gujarat (Rajkot, Somnath, Dwarka, Gandhidham, Porbandar, Surat, Bhuj).\n" +
                    "\n" +
                    "   By Train: Jamnagar Old Railway Station is about 4 km from the temple. You can find, regular or weekly, trains till Jamnagar from some states of India (like Delhi and Mumbai). Daily trains to Jamnagar can be taken from many cities of Gujarat (Ahmedabad, Vadodara, Surat).\n" +
                    "\n" +
                    "   By Air: Jamnagar Airport is 9/10 km from the city and is connected with Mumbai, Ahmedabad, Vadodara and other Gujarati cities. Also, you can take a flight till Ahmedabad and then reach Jamnagar via a car, bus or train.\n" +
                    "\n" +
                    "   Places to See Around the Temple:-\n" +
                    "\n" +
                    "   Narara Marine National Park is around 55 km away. It can be reached by road to do the 'coral walk' as the tide ebbs. Best time to visit is between December to March.\n" +
                    "   Dwarkadhish Temple is about 143 km from the temple.\n" +
                    "   Khijadia Bird Sanctuary can give you mesmerizing views of the wonderful local and migratory birds at a distance of 14 km from the temple. Best time to visit is between October to March.\n" +
                    "\n",
            "        Famous for its gigantic statue of Lord Hanuman, which is standing at an imposing height of 108 ft, Jhandewalan Hanuman Temple is one of the highly revered shrines in the capital. Being situated at a strategic location, this statue is so colossal that it can be seen from both Jhandewalan and Karol Bagh metro station that makes it a popular temple in Delhi. Talking about the temple, it was established in the year 2008 by Brahamleen Nagabba Shri Sevagir Ji Maharaj and is devoted to Lord Hanuman. However, the one interesting thing to know about this famous landmark is that the construction of Jhandewalan Hanuman Temple took almost 13 years to complete. Apart from its spiritual significance, this beautiful temple is also known for its aesthetic art and architecture making Jhandewalan Hanuman Temple a must-visit tourist attraction in Delhi. The entrance to the temple is constructed in such a way that it resembles the open mouth of a monster (Rakshas). Perhaps, this depicts one of those numerous de   mons that we   re conquered by Lord Hanuman during the period of his whole life.\n" +
                    "\n" +
                    "   Furthermore, the temple also has a sacred flame which is said to be brought from Jwalaji Temple at Kangra in Himachal Pradesh. Other than the Lord Hanuman, the temple also houses idols of Sai Baba, Lord Shani, and goddess of Dwarka. One can visit the temple on any day, yet, Tuesdays receives a large gathering of devotees as it is considered as the day of Lord Hanuman. During the evening aarti, a large number of devotees gather to witness the iconic view of the effigy where the hands of Lord Hanuman, held across the chest, move back to give pilgrims a glimpse of idols of Lord Rama and Goddess Sita located in the heart of Hanuman. This iconic event happens during the evening aarti on every Tuesday and Saturday. During the festival of Hanuman Jayanti, Jhandewalan Hanuman Temple becomes one of the most famous temples in Delhi. Besides, other festivals celebrated at this temple are Ram Navami, Shivaratri, Navaratri, and Janmashtami.\n" +
                    "\n" +
                    "   SPACIOUS STRUCTURE:-\n" +
                    "   With the imposing effigy of Lord Hanuman standing at a height of 108 ft, the architecture of this popular temple is a defining landmark of the city. Just for the fact, it is the second highest Lord Hanuman idol in the world. Not just this, the temple also has a unique corridor, which resembles the mouth of a monster (Rakshas), from where devotees have to enter the temple. Besides, the idol of Lord Hanuman also includes the images of Lord Rama and his wife Goddess Sita. These images are placed in the heart of Hanuman in his open apart chest.\n" +
                    "\n" +
                    "   OPENING/CLOSING TIME:-\n" +
                    "   The temple remains open from 6:00 AM to 10:00 PM.\n" +
                    "\n" +
                    "   ADDRESS:-\n" +
                    "   Jhandewalan Extension, Near Jhandewalan Metro Station\n" +
                    "\n" +
                    "   BEST TIME TO VISIT:-\n" +
                    "   Both Jhandewalan and Karol Bagh serves as the nearest metro stations from Jhandewalan Hanuman Mandir that are located at a distance of 140 m and 2 km, respectively. These stations lie at Blue line metro.\n" +
                    "\n",
            "        Hanuman Garhi is a 10th-century temple of Hanuman in Uttar Pradesh, India. Located in Ayodhya, it is one of the most important temples in the city along with other temples such as Nageshwar Nath.[1] The temple houses Hanuman's mother, Anjani, with a young Hanuman sitting on her lap.[2] This shrine is under the charge of Bairagi Mahants of Ramanandi Sampradaya and Nirvani Akhara.\n" +
                    "\n" +
                    "   History:-\n" +
                    "\n" +
                    "   Hanuman Garhi temple. A young priest is operating the Darshan system.\n" +
                    "   Hanuman Garhi temple is located near Ram Janmabhoomi. In 1855, the Nawab of Awadh BUILT the temple.[3][4] Historian Sarvepalli Gopal has said that the 1855 dispute was not for the Ayodhya temple dispute but for the Hanuman Garhi temple\n",
            "        Some 500 metres north of Prayagraj Fort, there lies a renowned religious site - Bade Hanuman Ji Temple. Also called Lete Hanuman Mandir, the shrine is an underground pit which houses an enormous image of Lord Hanuman in a lying position. This is the only Lord Hanuman temple in the world the idol in reclining position. Another interesting thing to know about this popular Hindu temple in Prayagraj, is that one side of Lord Hanuman’s statue is half immersed in the water of the River Ganges. In the monsoon season when the water level rises, it is believed that the water of the river rises to touch the feet of the deity. During this time, a lot of devotees come to visit this sacred sight. Inside the temple, there is a sanctum which houses the idol of Lord Hanuman which lies 8.1 feet below the shrine.\n" +
                    "\n" +
                    "   History:-\n" +
                    "   The legend has it, there was a rich trader in the city of Kannauj. With great wealth, the trader was living his life without any issue, however, he wanted a son. And for that, he went towards the Vidhyanchal hills in order to construct a temple of Lord Hanuman. As he desired, he built a temple in the hills and also erected a huge stone idol of Lord Hanuman which he decided to bathe in many sacred places.  After cleansing the statue from various sacred places, he arrived at Sangam in Prayagraj. At the night when he was asleep, he dreamt that if he leaves the statue at this place then all his unfulfilled wishes will ultimately come true. As a result of that, he left the statue at Prayagraj and returned to Kannauj. After some time, he was blessed with a son and all his wishes also came true. With the passage of time, the statue got stuck under the sand and remained submerged in the water\n" +
                    "\n",
            "        The Shree Camp Hanuman Temple (Hindi: कैंप हनुमान मंदिर) is one of the biggest Hanuman temples inIndia. It is situated in Ahmedabad Cantonment in Shahibaug, Ahmedabad in the Indian state of Gujarat.[1] The temple is owned by Shri Hanumanji Mandir Camp Trust Ahmedabad,\n" +
                    "\n" +
                    "   History:-\n" +
                    "   This temple was owned by Smt. Lalitaben Dave and Smt. Shivagangaben Trivedi. Shri Gajanand was employed by them to do Sewa Puja around 1920.\n" +
                    "\n" +
                    "   In 1952 the original owners handed the temple to a charitable trust named Shri Hanumanji Mandir Camp Trust Ahmedabad. the temple is owned and managed by the Trust, registered under A1427 Ahmedabad. Pandit Dwarka Prasad was one of the Pujari. His uncle Bhagawatpeasad acted as the managing trustee. After his death on 14.04.1994 his son Vishnuprasad became managing Trustee. After his death his son Atulbhai is appointed as a trustee on 26.07.2018.\n" +
                    "\n" +
                    "  Governance:-\n" +
                    "  The trustees include Vishnuprasad and two other descendants of the original owners, namely Shri Hemantbhai Vyas and Smt. Shobhanaben Trivedi. The other trustees are Parthivkumar Adhyaru (Pramukh trustee). Arunbhai Shah (Uppramukh trustee). Attorney shri Sudhir Nanavati is trustee cum legal adviser. S worker Shri Lalajibhi Kharawal's son Shri Lochen Kharawal is the final trustee.[2]\n" +
                    "\n" +
                    "  Notable visitors include former Prime Ministers of India Mr. Atal Bihari Vajpayee and Smt. Indira Gandhi.\n" +
                    "\n" +
                    "  Architecture:-\n" +
                    "  The temple is built in Dravidian style.[3] A gold plated statue of Sri Hanuman is nestled in the inner sanctum of the temple. The temple is beautifully carved and a provides a beautiful and calm space to the devotees to offer prayer and feel the breeze of devotion.\n" +
                    "\n",
            "        Mehandipur Balaji Temple is a famous temple of Hanuman ji located in Tehsil Sikrai, Rajasthan . Hanuman ji is called Balaji in many parts of India. This place looks very attractive situated between two hills. The pure climate and holy atmosphere of this place gives great pleasure to the mind. One can also see creations of city life here.\n" +
                    "    \n" +
                    "   The belief of Balaji appearing:- \n" +
                    "   Here three deities predominate – Shri Balaji Maharaj , Shri Pretraj Sarkar and Shri Bhairav Kotwal . These three gods appeared here about 1008 years ago. Twelve Mahants have done service-worship at this place since their appearance till now and till now three Mahants of this place are still present. Sarva Shree Ganeshpuri Ji Maharaj (First Servant) Shri Kishorepuri Ji Maharaj (Former Servant) and Shri Nareshpuri Ji Maharaj (Present Servant). The era of upliftment here started from the time of Shri Ganeshpuri Ji Maharaj and now it is increasing day by day. The main temple was built during his time. All the Dharamshalas were built during his time. In this way, his service period will be called the golden age of the history of Shri Balaji Ghata Mehdipur.\n" +
                    "\n" +
                    "   In the beginning there was a very rugged forest here. In the thick bushes, wild animals like Dror-cheetah, Baghera etc. lie.\n" +
                    "\n" +
                    "   In fact, this idol has not been sculpted by any artist separately, rather it is a part of the mountain itself and this entire mountain is as if its 'Kanak Bhudharakar' body. There was a small pond at the feet of this idol, whose water never used to pass. The secret is that on the left side of the Maharaj, a fine stream of water continuously flows from below the chest, which does not stop even if enough clothes are put on.\n" +
                    "\n" +
                    "   Thus the three gods were established. In Vikrami-Samvat 1979, Shri Maharaj changed his robe. Many devotees set out to fill the unloaded body in carts and flow it into the Ganges. When Mandawar reached Mandawar railway station with the cloak, the railway officials, considering it as baggage, wanted to weigh the cloak to collect the baggage fee, but they were unable to weigh it. In the course of weighing the chola, sometimes the weight would increase by one mind and sometimes it would decrease by one mind; Ultimately, the railway officer accepted defeat and the chole was dedicated to Ganga ji with respect. At that time havan, Brahmin food and recitation of religious books took place and a new light was born in the new stove, which spread light in every corner of India.\n" +
                    "\n" +
                    "   Rules:- \n" +
                    "   At least one week before going to Mehdipur for darshan of Balaji Maharaj, you should give up tamasik things like meat , eggs , alcohol etc. After this, darshan of Balaji Maharaj and recitation of Hanuman Chalisa should be done and lastly after visiting Kotwal Bhairavnath , recitation of Bhairav \u200B\u200BChalisa should be done. Do not take anything from anyone in the temple, even prasad , nor give anything like prasad to anyone.Do not give While coming and going, do not look back even by mistake. Go with a request to come and go, because one can come and go to Mehndipur only by Baba's permission.\n" +
                    "\n" +
                    "   Positions of deities and their enjoyment:- \n" +
                    "   \n" +
                    "   Balaji Maharaj - Balaji Maharaj is the king of Mehdipur and an incarnation of Lord Shiva . It is in front of them that the muscle of evil spirits is felt. Laddus are offered to Balaji Maharaj .\n" +
                    "   Bhairav Kotwal - Bhairav is the commander of the army of Baba Balaji Maharaj and the incarnation of Lord Shiva . For this reason, he is also called Kotwal Kaptan. They love to enjoy things made from urad dal. Especially in Dahi Bhalla and sweets made from urad dal, they especially like to enjoy Jalebi and Gulgula.\n" +
                    "   Pretraj Sarkar - Pretraj Sarkar is the punisher of Balaji Maharaj 's court. He alone has the right to punish the evil spirits. They enjoy cooked rice and kheer .\n" +
                    "   \n" +
                    "   Means of transport:- \n" +
                    "   \n" +
                    "   Divided into two districts ( Karauli and Dausa ) of Rajasthan state, Ghata Mehdipur place is 30 km from Bandikui Junction railway station situated on Delhi- Jaipur- Ajmer - Ahmedabad line. Which is the nearest railway station from Mehandipur Balaji. 24 hours bus, jeep, taxi etc. facility is available from Bandikui Junction to Mehandipur Balaji Dham. Direct buses going to Jaipur from Agra , Mathura , Vrindavan , Aligarh etc all stop at Mehandipur Balaji turn.",
            "        The Karmanghat Hanuman Temple is one of the oldest and popular Hindu temples in Hyderabad, in the state of Telangana, India. The presiding deity of the temple is Lord Hanuman and the temple complex also houses other deities viz. Lord Rama, Lord Shiva, Goddess Saraswathi, Goddess Durga, Goddess Santoshimata, Lord Venugopala Swamy, and Lord Jagannath. The temple is located at Karmanghat, near Santoshnagar and closer to the Nagarjuna Sagar Ring Road.[1]\n" +
                    "\n" +
                    "    Temple is open from 6am to 12 noon and 4:30pm to 8:30pm on all days except Tuesdays and Saturdays, where it is open from 5.30am to 1pm and 4:30pm to 9pm.\n" +
                    "\n" +
                    "    History:-\n" +
                    "    It was built in the 12th century A.D (approximately 1143). When the Kakatiya king Prola II went hunting and was resting under a tree, he heard the chanting of Lord Rama's name. Wondering who it was in the middle of a dense forest, he discovered a stone idol of God Hanuman, in seated posture and the voice coming from the vigraha. Having paid his respects, he returned to his capital, and that night, Lord appeared in his dream and asked him to construct a temple.[2]\n" +
                    "\n" +
                    "\n" +
                    "   Karmanghat Temple Arch:-\n" +
                    "   Aurangzeb sent out his armies to all corners of the country for further expansion of Mughal Empire. At this temple, the army couldn't even step close to the compound wall. When the general reported this to Aurangzeb, he himself went with a crow bar to break down the temple. At the threshold of the temple, he heard a deafening roar rumbling like thunder, and the crowbar slipped from his hands as he was shaking in fear. Then he heard a voice in the heavens \"Mandir todna hai , to karo man ghat\" (translation: \"If you want to break down the temple, harden your heart.\") which is why the place got the name kar-man-ghat.[3] And to this day, Lord Anjaneya sits peacefully meditating and blessing devotees, as Dhyana Anjaneya Swamy.\n" +
                    "\n" +
                    "   Present Day:-\n" +
                    "   The temple is very popular among devotees in Hyderabad. Faithfuls offer prayers and perform religious rituals for Lord Hanuman at the temple on Tuesday's and Saturday's every week. On the auspicious day of Hanuman Jayanti, devotees visit the temple in large numbers to offer special pooja to the Lord and celebrate his birthday. The temple management provides annadanam meaning free meal to limited people on all days of the year. To this day, Lord Anjaneya sits peacefully meditating and blessing devotees, as Dhyana Anjaneya Swamy."};

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );


        getSupportActionBar().setTitle( "Temples" );
        setContentView( R.layout.activity_temples );
        listView = (ListView) findViewById( R.id.listview );
        TempleAdapter templeAdapter = new TempleAdapter( getApplicationContext(), templename, templeImage );
        listView.setAdapter( templeAdapter );


        listView.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent( getApplicationContext(), templeinfo.class );
                intent.putExtra( "photo", templeImage[i] );
                intent.putExtra( "name", templename[i] );
                intent.putExtra( "place", templeplace[i] );
                intent.putExtra( "description", templedescription[i] );
                startActivity( intent );


            }
        } );
    }

}