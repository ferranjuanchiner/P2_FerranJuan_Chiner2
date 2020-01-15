/*
 * Copyright (C) 2017 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.P2_JuanChiner_Ferran2.content;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import com.example.android.P2_JuanChiner_Ferran2.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Helper class for providing sample song content.
 */
public class FilmUtils {

    // An ArrayList of Songs
    public static final List<Film> FILM_ITEMS = new ArrayList<>();

    // The ID for the index into song titles.
    public static final String FILM_ID_KEY = "item_id";

    // The number of songs.
    private static final int COUNT = 10;

    /**
     * A Film item represents a song title, and song details.
     */
    public static class Film {
        public final String film_title;
        public final String details;
        public final int image;

        private Film(String content, String details, int image) {
            this.film_title = content;
            this.details = details;
           this.image = image;
        }
    }

    /**
     * Add an item to the array.
     *
     * @param item Each song
     */
    private static void addItem(Film item) {
        FILM_ITEMS.add(item);
    }

    static {
        // Fill the array with songs.
        for (int i = 0; i < COUNT; i++) {
            addItem(createSongAtPosition(i));
        }
    }

    private static Film createSongAtPosition(int position) {
        String newTitle;
        String newDetail;
        int image;
        switch (position) {
            case 0:
                newTitle = "Reservoir Dogs (1992)";
                newDetail = "Reservoir Dogs\n\nSix criminals, who are strangers to each other, are hired by a crime boss," +
                        " Joe Cabot, to carry out a diamond robbery. Right at the outset, they are given false names with" +
                        " the intention that they won't get too close and will concentrate on the job instead. They are" +
                        " completely sure that the robbery is going to be a success. But, when the police show up right" +
                        " at the time and the site of the robbery, panic spreads amongst the group members, and two of" +
                        " them are killed in the subsequent shootout, along with a few policemen and civilians. When the" +
                        " remaining people assemble at the premeditated rendezvous point (a warehouse), they begin to" +
                        " suspect that one of them is an undercover cop.";
                image = R.drawable.film1;
                break;
            case 1:
                newTitle = "Pulp Fiction (1994)";
                newDetail = "Pulp Fiction\n\nJules Winnfield and Vincent Vega are two hit men who are out to retrieve a suitcase" +
                        " stolen from their employer, mob boss Marsellus Wallace. Wallace has also asked Vincent to take his wife" +
                        " Mia out a few days later when Wallace himself will be out of town. Butch Coolidge is an aging boxer who" +
                        " is paid by Wallace to lose his fight. The lives of these seemingly unrelated people are woven together" +
                        " comprising of a series of funny, bizarre and uncalled-for incidents.";
                image = R.drawable.film2;
               break;
            case 2:
                newTitle = "Jackie Brown (1997)";
                newDetail = "Jackie Brown\n\nThe middle-aged stewardess Jackie Brown smuggles money from Mexico to Los Angeles" +
                        " for the arms dealer Ordell Robbie. When she gets caught by the agents Ray Nicolet and Mark Dargus with" +
                        " ten thousand dollars and cocaine in her purse, they propose a deal to her to help them to arrest Ordell" +
                        " in exchange of her freedom. Meanwhile Ordell asks the 56-year-old Max Cherry, who runs a bail bond business," +
                        " to release Jackie Brown with the intention of eliminating her. Jackie suspects of Ordell's intention and plots a" +
                        " complicated confidence game with Max to steal half a million dollars from Ordell.";
                image = R.drawable.film3;
                break;
            case 3:
                newTitle = "Kill Bill Vol 1 (2003)";
                newDetail = "Kill Bill Vol 1\n\nThe Bride is a female assassin, a trained killer who has been betrayed" +
                        " by The Deadly Viper Assassination Squad led by her former boss Bill who gunned her down at her wedding leaving her" +
                        " for dead. The Bride awakes four years later and she sets out to begin her quest for vengeance. With help of one of Bill's" +
                        " former tutors, retired sword maker Hattori Hanzo, The Bride sets out to eliminate her first two targets on her list: Vernita" +
                        " Green, who has retired from the Deadly Viper Assassin Squad and has a daughter and O-Ren Ishii, who is now the kingpin of the" +
                        " Toyko criminal underworld and leader of the Crazy 88 crime gang. The Bride, engaging in a roaring rampage of revenge, will not" +
                        " rest until every member of The Deadly Viper Assassin Squad is dead and she will save Bill for last.";
                image = R.drawable.film4;
                break;
            case 4:
                newTitle = "Kill Bill Vol 2 (2004)";
                newDetail = "Kill Bill Vol 2\n\nAfter having successfully crossed the first two members of the Deadly Viper Assassination Squad - Vernita Green" +
                        ", O-Ren Ishii, and the Crazy 88s, The Bride (whose real name is now revealed to be Beatrix Kiddo) sets her sites on the remaining three." +
                        " While she goes after Bill's brother Budd, Elle Driver, and ultimately Bill himself, we learn more about Beatrix's back story." +
                        " This includes her time in China training under ultra strict traditionalist martial arts legend Pai Mei, who had a taste for brutal action," +
                        " and a super-secret technique that can take out any opponent, and how she got to be where she is. Unfortunately Elle and Budd are out to" +
                        " stop her from getting to Bill and learning the truth about the attack on her wedding four years earlier. Getting to Bill will be an " +
                        "ultimately rewarding experience for Beatrix, but can she get through Budd and Elle first?";
                image = R.drawable.film5;
                break;
            case 5:
                newTitle = "Death Proof (2007)";
                newDetail = "Death Proof\n\nIn Austin, Texas, the girlfriends Julia, Arlene and Shanna meet in a bar to drink, smoke and make out with their" +
                        " boyfriends before traveling alone to Lake LBJ to spend the weekend together. They meet the former Hollywood stuntman Mike, who takes" +
                        " Pam out in his death-proof stunt car. Fourteen months later, Mike turns up in Lebanon, Tennessee and chase Abernathy, Zoë and Kim," +
                        " but these girls are tough and decide to pay-back the attack.";
                image = R.drawable.film6;
                break;
            case 6:
                newTitle = "Inglourious Basterds (2009)";
                newDetail = "Inglourious Basterds\n\nIn German-occupied France, young Jewish refugee Shosanna Dreyfus witnesses the slaughter of her family by" +
                        " Colonel Hans Landa. Narrowly escaping with her life, she plots her revenge several years later when German war hero Fredrick Zoller" +
                        " takes a rapid interest in her and arranges an illustrious movie premiere at the theater she now runs. With the promise of every major" +
                        " Nazi officer in attendance, the event catches the attention of the Basterds, a group of Jewish-American guerrilla soldiers led by the" +
                        " ruthless Lt. Aldo Raine. As the relentless executioners advance and the conspiring young girl's plans are set in motion, their paths will" +
                        " cross for a fateful evening that will shake the very annals of history.";
                image = R.drawable.film7;
                break;
            case 7:
                newTitle = "Django Unchained (2012)";
                newDetail = "Django Unchained\n\nIn 1858, a bounty hunter named Schultz seeks out a slave named Django and buys him because he needs him to find some" +
                        " men he is looking for. After finding them, Django wants to find his wife, Broomhilda, who along with him were sold separately by his former" +
                        " owner for trying to escape. Schultz offers to help him if he chooses to stay with him and be his partner. Eventually they learn that she was" +
                        " sold to a plantation in Mississippi. Knowing they can't just go in and say they want her, they come up with a plan so that the owner will" +
                        " welcome them into his home and they can find a way..";
                image = R.drawable.film8;
                break;
            case 8:
                newTitle = "The Hateful Eight (2015)";
                newDetail = "The Hateful Eight\n\nSome time after the Civil War, a stagecoach hurtles through the wintry Wyoming landscape. Bounty hunter John Ruth and" +
                        " his fugitive captive Daisy Domergue race towards the town of Red Rock, where Ruth will bring Daisy to justice. Along the road, they encounter" +
                        " Major Marquis Warren (an infamous bounty hunter) and Chris Mannix (a man who claims to be Red Rock's new sheriff). Lost in a blizzard, the bunch" +
                        " seeks refuge at Minnie's Haberdashery. When they arrive they are greeted by unfamiliar faces: Bob, who claims to be taking care of the place while" +
                        " Minnie is gone; Oswaldo Mobray, the hangman of Red Rock; Joe Gage, a cow puncher; and confederate general Sanford Smithers. As the storm overtakes" +
                        " the mountainside, the eight travelers come to learn that they might not make it to Red Rock after all...";
                image = R.drawable.film9;
                break;

            default:
                newTitle = "Once Upon a Time in Hollywood (2019)";
                newDetail = "Once Upon a Time in Hollywood\n\n1969. Rick Dalton was once the star of a highly popular TV series but a few bad choices have set his" +
                        " career back, leaving him wondering if he should quit showbiz altogether. His best friend is Cliff Booth, an aging stuntman who was Dalton's" +
                        " stunt-double in movies and TV. His career is largely over. While Booth ekes out an existence, Dalton still lives a life of relative luxury" +
                        " in Hollywood, rubbing shoulders with the rich and famous. In fact, his neighbours are Roman Polanski and Sharon Tate.";
                image = R.drawable.film10;
                break;
        }
        return new Film(newTitle, newDetail, image);
    }
}
