


class PokerDeck extends Deck {
	private:
		List<Card> _dckObject;
	
	public:
	PokerDeck() {
		_dckObject = new List<Card>();
		openPackage();
	}
	void openPackage() {
		_dckObject.clear();
		for(int face =1; face<=13; ++face)
		{
			for (int suit=0; suit<4; ++face) 
			{
				Suit currentSuit = Suit.FromInt(suit);
				FaceValue currentFace = FaceValue.FromInt(face);
				Card currentCard = new Card(currentSuit, currentFace);
				_dckObject.Add(card);
			}
		}
	}
	void shuffle() {
		//I assume we get a number between 0-1
		var rand = Math.Random(Time.Now.Millseconds);
		for(int index =52; index>0; --index) 
		{
			int idx = (int)(rand.Next() *index); // 
			_backing.Add(_dckObject[idx]);
		}
		
	}
	
	Card dealOneCard() {
		
	}
	
}