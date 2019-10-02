 la classe Player comporte :
 1- 3 attributs d'instance 
 2- un constructeur pour initialiser les attributs
 3- la methode isAlive retourne true si health >0 sinon retourne false
 4- la methode hit permet  reduire health  du power de l'opponent
 la methode to_s pour afficher un objet de type Player 

 --------------------
 pour les autres methodes : 
 la methode fight pour simuler un combat entre 2 joueurs et s'arrete quand un joueur est "mort" (health <=0)  
 la methode show permet de recevoir une liste de d'objets de type Player
 , parcourir cette liste en affichant les informations de chaque joueur grace 
 à un appel implicite de la fonction to_s (to_string ) de l'objet en cours 
# initialisation de 2 objets de type player
  p1 = Player.new("Joueur 1 ", 200, 10)
  p2 = Player.new("Joueur 2 ", 100, 10)
# afficher les informations des 2 joueurs 
  show_info(p1, p2)
 #appel de la fonction fight entre les 2 joueurs p1 et p2
  fight(p1, p2)

